/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.converters;

import java.util.ArrayList;
import java.util.List;
import services.DTOS.InformePersonaDTO;
import services.DTOS.PerfilPersonaDTO;
import services.Entities.InformePersona;
import services.Entities.PerfilPersona;
import static services.converters.PerfilPersonaConverter.entityToDTO;

/**
 *
 * @author estudiante
 */
public class InformePersonaConverter {
    
    public static InformePersona dtoToEntity( InformePersonaDTO ip){
        InformePersona ipn = new InformePersona();
        ipn.setCantidadEdad(ip.getCantidadEdad());
        ipn.setCantidadPresupuesto(ip.getCantidadPresupuesto());
        ipn.setCantidadSexo(ip.getCantidadSexo());
        ipn.setCantidadTotal(ip.getCantidadTotal());
        ipn.setOtraEdadF(ip.getOtraEdadF());
        ipn.setOtraEdadI(ip.getOtraEdadI());
        ipn.setOtroPresupuestoF(ip.getOtroPresupuestoF());
        ipn.setOtroPresupuestoI(ip.getOtroPresupuestoI());
        return ipn; 
    }
    
     public static InformePersonaDTO entityToDTO( InformePersona ip){
        InformePersonaDTO ipn = new InformePersonaDTO();
        ipn.setCantidadEdad(ip.getCantidadEdad());
        ipn.setCantidadPresupuesto(ip.getCantidadPresupuesto());
        ipn.setCantidadSexo(ip.getCantidadSexo());
        ipn.setCantidadTotal(ip.getCantidadTotal());
        ipn.setOtraEdadF(ip.getOtraEdadF());
        ipn.setOtraEdadI(ip.getOtraEdadI());
        ipn.setOtroPresupuestoF(ip.getOtroPresupuestoF());
        ipn.setOtroPresupuestoI(ip.getOtroPresupuestoI());
        ipn.setId(ip.getId());
        return ipn; 
    }
     
     public static List<InformePersonaDTO> entityToDtoList( List<InformePersona> lista){
        List<InformePersonaDTO> listaN = new ArrayList<InformePersonaDTO>();
        int size = lista.size();
        for(int i=0; i<size;i++){
            InformePersona u = (InformePersona) lista.get(i);
            listaN.add(entityToDTO(u));
        }
        return listaN;
    }
    
}
