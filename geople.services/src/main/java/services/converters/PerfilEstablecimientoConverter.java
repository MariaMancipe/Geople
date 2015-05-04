/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.converters;

import java.util.ArrayList;
import java.util.List;
import services.DTOS.PerfilEstablecimientoDTO;
import services.DTOS.PerfilPersonaDTO;
import services.Entities.PerfilEstablecimiento;
import services.Entities.PerfilPersona;
import static services.converters.PerfilPersonaConverter.entityToDTO;

/**
 *
 * @author estudiante
 */
public class PerfilEstablecimientoConverter {
    
    public static PerfilEstablecimientoDTO entityToDTO( PerfilEstablecimiento pe){
        PerfilEstablecimientoDTO pen = new PerfilEstablecimientoDTO();
        pen.setArea(pe.getArea());
        pen.setEspecialidad(pe.getEspecialidad());
        pen.setId(pe.getId());
        pen.setLatitud(pe.getLatitud());
        pen.setLongitud(pe.getLongitud());
        pen.setPresupuestoF(pe.getPresupuestoF());
        pen.setPresupuestoI(pe.getPresupuestoI());
        pen.setTipo(pe.getTipo());
        return pen;
    }
    
    public static PerfilEstablecimiento DTOToEntity( PerfilEstablecimientoDTO pe){
        PerfilEstablecimiento pen = new PerfilEstablecimiento();
        pen.setArea(pe.getArea());
        pen.setEspecialidad(pe.getEspecialidad());
        pen.setId(pe.getId());
        pen.setLatitud(pe.getLatitud());
        pen.setLongitud(pe.getLongitud());
        pen.setPresupuestoF(pe.getPresupuestoF());
        pen.setPresupuestoI(pe.getPresupuestoI());
        pen.setTipo(pe.getTipo());
        return pen;
    }
    
    public static List<PerfilEstablecimientoDTO> entityToDtoList( List<PerfilEstablecimiento> lista){
        List<PerfilEstablecimientoDTO> listaN = new ArrayList<PerfilEstablecimientoDTO>();
        int size = lista.size();
        for(int i=0; i<size;i++){
            PerfilEstablecimiento u = (PerfilEstablecimiento) lista.get(i);
            listaN.add(entityToDTO(u));
        }
        return listaN;
    }
}
