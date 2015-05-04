/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.services;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import services.Entities.Establecimiento;
import services.Entities.Usuario;
import services.Init.PersistenceManager;
import services.converters.EstablecimientoConverter;
import services.converters.UsuarioConverter;

/**
 *
 * @author estudiante
 */
@Path("/establecimientos")
@Produces(MediaType.APPLICATION_JSON)
public class EstablecimientoServices {
    
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
    // GET
    //--------------------------------------------------------------------------
    
    /**
     * Los detalles de un establecimiento
     *
     * @param nit el nit del establecimiento
     * @return la informacion de un establecimiento
     */
    @GET
    @Path("/{nit}")
    public Response findById(@PathParam("nit") Long nit) {
        Establecimiento establecimiento = entityManager.find(Establecimiento.class, nit);
        return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(EstablecimientoConverter.entityToDTO(establecimiento)).build();
    }

    /**
     * La lista de todos los establecimientos registrados en la aplicacion
     *
     * @return todos los establecimientos registrados
     */
    @GET
    @Path("/todos")
    public Response findAll() {
        Query q = entityManager.createQuery("select u from Establecimiento u ");
        List<Establecimiento> establecimientos = q.getResultList();
        return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(EstablecimientoConverter.entityToDtoList(establecimientos)).build();

    }
    
}
