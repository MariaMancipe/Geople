/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.converters;

import java.util.ArrayList;
import java.util.List;
import services.DTOS.BusquedaDTO;
import services.DTOS.RegistroDTO;
import services.Entities.Busqueda;
import services.Entities.Registro;
import static services.converters.RegistroConverter.entityToDTO;

/**
 *
 * @author estudiante
 */
public class BusquedaConverter {
    
    public static Busqueda DTOToEntity(BusquedaDTO bu){
        Busqueda bun = new Busqueda();
        bun.setCantidadPersonas(bu.getCantidadPersonas());
        bun.setFecha(bu.getFecha());
        bun.setNombre(bu.getNombre());
        return bun;
    }
    
    public static BusquedaDTO entityToDTO(Busqueda bu){
        BusquedaDTO bun = new BusquedaDTO();
        bun.setCantidadPersonas(bu.getCantidadPersonas());
        bun.setFecha(bu.getFecha());
        bun.setNombre(bu.getNombre());
        return bun;
    }
   public static List<BusquedaDTO> entityToDtoList( List<Busqueda> lista){
        List<BusquedaDTO> listaN = new ArrayList<BusquedaDTO>();
        int size = lista.size();
        for(int i=0; i<size;i++){
            Busqueda u = (Busqueda) lista.get(i);
            listaN.add(entityToDTO(u));
        }
        return listaN;
    }
    
}
