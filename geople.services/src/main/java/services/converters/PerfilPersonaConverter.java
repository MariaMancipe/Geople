/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.converters;

import java.util.ArrayList;
import java.util.List;
import services.DTOS.PerfilPersonaDTO;
import services.DTOS.RegistroDTO;
import services.Entities.PerfilPersona;
import services.Entities.Registro;
import static services.converters.RegistroConverter.entityToDTO;

/**
 *
 * @author estudiante
 */
public class PerfilPersonaConverter {
    
    public static PerfilPersonaDTO entityToDTO(PerfilPersona pp){
        PerfilPersonaDTO ppn = new PerfilPersonaDTO();
        ppn.setArea(pp.getArea());
        ppn.setEdadF(pp.getEdadF());
        ppn.setEdadI(pp.getEdadI());
        ppn.setId(pp.getId());
        ppn.setLatitud(pp.getLatitud());
        ppn.setLongitud(pp.getLongitud());
        ppn.setPresupuestoF(pp.getPresupuestoF());
        ppn.setPresupuestoI(pp.getPresupuestoI());
        ppn.setSexo(pp.getSexo());
        return ppn;
    }
    
    public static PerfilPersona DTOToEntity(PerfilPersonaDTO pp){
        PerfilPersona ppn = new PerfilPersona();
        ppn.setArea(pp.getArea());
        ppn.setEdadF(pp.getEdadF());
        ppn.setEdadI(pp.getEdadI());
        ppn.setInformes(ppn.getInformes());
        ppn.setLatitud(pp.getLatitud());
        ppn.setLongitud(pp.getLongitud());
        ppn.setPresupuestoF(pp.getPresupuestoF());
        ppn.setPresupuestoI(pp.getPresupuestoI());
        ppn.setSexo(pp.getSexo());
        return ppn;
    }
    
    public static List<PerfilPersonaDTO> entityToDtoList( List<PerfilPersona> lista){
        List<PerfilPersonaDTO> listaN = new ArrayList<PerfilPersonaDTO>();
        int size = lista.size();
        for(int i=0; i<size;i++){
            PerfilPersona u = (PerfilPersona) lista.get(i);
            listaN.add(entityToDTO(u));
        }
        return listaN;
    }
}
