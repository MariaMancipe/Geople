/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.services;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import services.DTOS.RegistroDTO;
import services.Entities.Registro;
import services.Entities.Usuario;
import services.Init.PersistenceManager;
import services.converters.RegistroConverter;
import services.converters.UsuarioConverter;

/**
 *
 * @author estudiante
 */

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioServices {
    
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

    //--------------------------------------------------------------------------
    // POST
    //--------------------------------------------------------------------------
    
    @POST
    @Path("/lugar")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registrarLugar(RegistroDTO registro) throws JSONException {
        JSONObject respuesta = new JSONObject();
        Registro registroEntity = new Registro();
        
        //#Jetty
        EntityTransaction tran = entityManager.getTransaction();
        //#Glassfish
        //UserTransaction tran = Utils.loadUtx();
        
        registroEntity = RegistroConverter.DTOtoEntity(registro);
        try {
            tran.begin();
            //#Glassfish
            //entityManager.joinTransaction();

            entityManager.persist(registro);

            tran.commit();
            entityManager.refresh(registroEntity);
            respuesta.put("registro_id", registroEntity.getId());

        } catch (Throwable t) {
            t.printStackTrace();
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
           registroEntity = null;
            respuesta.put("Exception message", t.getMessage());
            return Response.status(500).header("Access-Control-Allow-Origin", "*").entity(respuesta).build();
        } finally {
            entityManager.clear();
            entityManager.close();
        }
        return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(respuesta).build();
    }
    
    //--------------------------------------------------------------------------
    // GET
    //--------------------------------------------------------------------------
    
    /**
     * Los detalles de un usuario
     *
     * @param id el numero de id del usuario
     * @return la informacion de un usuario en particular
     */
    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(UsuarioConverter.entityToDto(usuario)).build();
    }

    /**
     * La lista de todos los usuarios registrados en la aplicacion
     *
     * @return todos los usuarios registrados
     */
    @GET
    @Path("/todos")
    public Response findAll() {
        Query q = entityManager.createQuery("select u from Usuario u ");
        List<Usuario> usuarios = q.getResultList();
        return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(UsuarioConverter.entityToDtoList(usuarios)).build();

    }
}
