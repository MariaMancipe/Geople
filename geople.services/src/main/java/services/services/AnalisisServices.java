/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.services;

import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import services.DTOS.InformeEstablecimientoDTO;
import services.DTOS.InformePersonaDTO;
import services.DTOS.PerfilEstablecimientoDTO;
import services.DTOS.PerfilPersonaDTO;
import services.Entities.Establecimiento;
import services.Entities.InformeEstablecimiento;
import services.Entities.InformePersona;
import services.Entities.Registro;
import services.Entities.Usuario;
import services.Init.PersistenceManager;
import services.converters.EstablecimientoConverter;
import services.converters.InformeEstablecimientoConverter;
import services.converters.InformePersonaConverter;
import services.converters.RegistroConverter;

/**
 *
 * @author estudiante
 */
@Path("/analisis")
@Produces(MediaType.APPLICATION_JSON)
public class AnalisisServices 
{
    //--------------------------------------------------------------------------
    // Atributos
    //--------------------------------------------------------------------------
    /**
     * Atributo del entity manager Unidad de persistencia, "myPU"
     */
    @PersistenceContext(unitName = "GeoplePU")
    EntityManager entityManager;

    //--------------------------------------------------------------------------
    // INIT
    //--------------------------------------------------------------------------
    /**
     * Inicializa el entity manager
     */
    @PostConstruct
    public void init() {
        try {
            entityManager = PersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se incializo correctamente!!!");
        }
    }
    
    @POST
    @Path("/contextual")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response analisisContextual(PerfilEstablecimientoDTO perfil) throws JSONException{
        Query q = entityManager.createQuery("select u from Establecimiento u ");
        List<Establecimiento> establecimientos = q.getResultList();
        InformeEstablecimientoDTO informe = analizarContextual(perfil, establecimientos);
        
        JSONObject respuesta = new JSONObject();
        InformeEstablecimiento informeEntity = new InformeEstablecimiento();
        
        //#Jetty
        EntityTransaction tran = entityManager.getTransaction();
        //#Glassfish
        //UserTransaction tran = Utils.loadUtx();
        
        informeEntity = InformeEstablecimientoConverter.DTOToEntity(informe);
        try {
            tran.begin();
            //#Glassfish
            //entityManager.joinTransaction();

            entityManager.persist(informe);

            tran.commit();
            entityManager.refresh(informeEntity);
            respuesta.put("informe_establecimiento_id", informeEntity.getId());

        } catch (Throwable t) {
            t.printStackTrace();
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
           informeEntity = null;
            respuesta.put("Exception message", t.getMessage());
            return Response.status(500).header("Access-Control-Allow-Origin", "*").entity(respuesta).build();
        } finally {
            entityManager.clear();
            entityManager.close();
        }
        return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(informe).build();
       
    }
    
    @POST
    @Path("/demografico")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response analisisDemografico(PerfilPersonaDTO perfil) throws JSONException{
        Query q = entityManager.createQuery("select u from Usuario u ");
        List<Usuario> usuarios = q.getResultList();
        InformePersonaDTO informe = analizarDemo(perfil, usuarios);
        
        JSONObject respuesta = new JSONObject();
        InformePersona informeEntity = new InformePersona();
        
        //#Jetty
        EntityTransaction tran = entityManager.getTransaction();
        //#Glassfish
        //UserTransaction tran = Utils.loadUtx();
        
        informeEntity = InformePersonaConverter.dtoToEntity(informe);
        try {
            tran.begin();
            //#Glassfish
            //entityManager.joinTransaction();

            entityManager.persist(informe);

            tran.commit();
            entityManager.refresh(informeEntity);
            respuesta.put("informe_persona_id", informeEntity.getId());

        } catch (Throwable t) {
            t.printStackTrace();
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
           informeEntity = null;
            respuesta.put("Exception message", t.getMessage());
            return Response.status(500).header("Access-Control-Allow-Origin", "*").entity(respuesta).build();
        } finally {
            entityManager.clear();
            entityManager.close();
        }
        return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(informe).build();
       
    }
    
    
    public InformeEstablecimientoDTO analizarContextual( PerfilEstablecimientoDTO perfil, List<Establecimiento> establecimientos)
    {
       int size = establecimientos.size();
       int cantidadTotal = 0;
       int cantidadTipo = 0;
       int cantidadEspecialidad = 0;
       int cantidadPresupuesto = 0;
       int grados = perfil.getArea()/100;
       
       for(int i = 0; i< size; i++)
       {
           Establecimiento es = (Establecimiento) establecimientos.get(i);
           if((es.getLatitud()< (perfil.getLatitud()+grados)) && (es.getLongitud()< (perfil.getLongitud()+grados))){
               cantidadTotal++;
               if( es.getTipo().equals(perfil.getTipo())){
                   cantidadTipo++;
               }
               if(es.getEspecialidad().equals(perfil.getTipo())){
                   cantidadEspecialidad++;
               }
               if(es.getPresupuestoI() > perfil.getPresupuestoI() && es.getPresupuestF()< perfil.getPresupuestoF())
               {
                   cantidadPresupuesto++;
               }
           }
       }
       
       InformeEstablecimientoDTO informe = new InformeEstablecimientoDTO();
       informe.setCantidadEspecialidad(cantidadEspecialidad);
       informe.setCantidadPresupuesto(cantidadPresupuesto);
       informe.setCantidadTipo(cantidadTipo);
       informe.setCantidadTotal(cantidadTotal);
       informe.setOtraEspecialidad("Comida Rapida");
       informe.setOtroPresupuestoF(perfil.getPresupuestoF()-5000);
       informe.setOtroPresupuestoI(perfil.getPresupuestoI()-5000);
       informe.setOtroTipo(0);
       return informe;
    }
    
    public InformePersonaDTO analizarDemo( PerfilPersonaDTO perfil, List<Usuario> usuarios)
    {
        int size = usuarios.size();
        int cantidadEdad = 0;
        int cantidadTotal = 0;
        int cantidadPresupuesto =  0;
        int cantidadSexo = 0;
        int grados = perfil.getArea()/100;
        
        for( int i =0; i<size; i++){
            Usuario usuario = (Usuario) usuarios.get(i);
            List<Registro> registro = usuario.getLugares();
            Iterator iter = usuarios.iterator();
            while( iter.hasNext() ){
                Registro reg =(Registro) iter.next();
                if( (reg.getLatitud()< (perfil.getLatitud()+grados)) && (reg.getLongitud()< (perfil.getLongitud()+grados))){
                    cantidadTotal++;
                    if( usuario.getEdad() >= perfil.getEdadI() && usuario.getEdad() <= perfil.getEdadF()){
                        cantidadEdad++;
                    }
                    if( usuario.getSexo().equals(perfil.getSexo()))
                    {
                        cantidadSexo++;
                    }
                    if( usuario.getPresupuestoI() > perfil.getPresupuestoI() && usuario.getPresupuestoF()< perfil.getPresupuestoF()){
                        cantidadPresupuesto++;
                    }
                    break;
                }
                else{
                    continue;
                }
                
            }
            
        }
        InformePersonaDTO  informe = new InformePersonaDTO();
        informe.setCantidadEdad(cantidadEdad);
        informe.setCantidadPresupuesto(cantidadPresupuesto);
        informe.setCantidadTotal(cantidadTotal);
        informe.setCantidadSexo(cantidadSexo);
        informe.setOtraEdadI(perfil.getEdadI()-5);
        informe.setOtraEdadF(perfil.getEdadF()-5);
        informe.setOtroPresupuestoF(perfil.getPresupuestoF()-6000);
        informe.setOtroPresupuestoI(perfil.getPresupuestoI()-6000);
        return informe;
        
    }
    
    
}
