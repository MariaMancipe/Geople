/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.converters;

import java.util.ArrayList;
import java.util.List;
import services.DTOS.EstablecimientoDTO;
import services.Entities.Establecimiento;

/**
 *
 * @author estudiante
 */
public class EstablecimientoConverter {
    
    public static Establecimiento DTOToEntity( EstablecimientoDTO es ){
        Establecimiento esn = new Establecimiento();
        esn.setEspecialidad(es.getEspecialidad());
        esn.setNit(es.getNit());
        esn.setNombre(es.getNombre());
        esn.setPresupuestF(es.getPresupuestF());
        esn.setPresupuestoI(es.getPresupuestoI());
        esn.setTipo(es.getTipo());
        esn.setLatitud(es.getLatitud());
        esn.setLongitud(es.getLongitud());
        return esn;
    }
    
    public static EstablecimientoDTO entityToDTO( Establecimiento es ){
        EstablecimientoDTO esn = new EstablecimientoDTO();
        esn.setEspecialidad(es.getEspecialidad());
        esn.setNit(es.getNit());
        esn.setNombre(es.getNombre());
        esn.setPresupuestF(es.getPresupuestF());
        esn.setPresupuestoI(es.getPresupuestoI());
        esn.setTipo(es.getTipo());
        esn.setLatitud(es.getLatitud());
        esn.setLongitud(es.getLongitud());
        return esn;
    }
    
    public static List<EstablecimientoDTO> entityToDtoList( List<Establecimiento> lista){
        List<EstablecimientoDTO> listaN = new ArrayList<EstablecimientoDTO>();
        int size = lista.size();
        for(int i=0; i<size;i++){
            Establecimiento u = (Establecimiento) lista.get(i);
            listaN.add(entityToDTO(u));
        }
        return listaN;
    }
    
}
