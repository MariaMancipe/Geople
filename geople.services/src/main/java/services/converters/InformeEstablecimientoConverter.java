/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.converters;

import java.util.ArrayList;
import java.util.List;
import services.DTOS.InformeEstablecimientoDTO;
import services.DTOS.PerfilPersonaDTO;
import services.Entities.InformeEstablecimiento;
import services.Entities.PerfilPersona;
import static services.converters.PerfilPersonaConverter.entityToDTO;

/**
 *
 * @author estudiante
 */
public class InformeEstablecimientoConverter {
    
    public static InformeEstablecimiento DTOToEntity(InformeEstablecimientoDTO ie)
    {
        InformeEstablecimiento ien = new InformeEstablecimiento();
        ien.setCantidadEspecialidad(ie.getCantidadEspecialidad());
        ien.setCantidadPresupuesto(ie.getCantidadPresupuesto());
        ien.setCantidadTipo(ie.getCantidadTipo());
        ien.setCantidadTotal(ie.getCantidadTotal());
        ien.setOtraEspecialidad(ie.getOtraEspecialidad());
        ien.setOtroPresupuestoF(ie.getOtroPresupuestoF());
        ien.setOtroPresupuestoI(ie.getOtroPresupuestoI());
        ien.setOtroTipo(ie.getOtroTipo());
        return ien;
    }
    
    public static InformeEstablecimientoDTO entityToDTO(InformeEstablecimiento ie)
    {
        InformeEstablecimientoDTO ien = new InformeEstablecimientoDTO();
        ien.setCantidadEspecialidad(ie.getCantidadEspecialidad());
        ien.setCantidadPresupuesto(ie.getCantidadPresupuesto());
        ien.setCantidadTipo(ie.getCantidadTipo());
        ien.setCantidadTotal(ie.getCantidadTotal());
        ien.setOtraEspecialidad(ie.getOtraEspecialidad());
        ien.setOtroPresupuestoF(ie.getOtroPresupuestoF());
        ien.setOtroPresupuestoI(ie.getOtroPresupuestoI());
        ien.setOtroTipo(ie.getOtroTipo());
        ien.setId(ie.getId());
        return ien;
    }
    
    public static List<InformeEstablecimientoDTO> entityToDtoList( List<InformeEstablecimiento> lista){
        List<InformeEstablecimientoDTO> listaN = new ArrayList<InformeEstablecimientoDTO>();
        int size = lista.size();
        for(int i=0; i<size;i++){
            InformeEstablecimiento u = (InformeEstablecimiento) lista.get(i);
            listaN.add(entityToDTO(u));
        }
        return listaN;
    }
    
}
