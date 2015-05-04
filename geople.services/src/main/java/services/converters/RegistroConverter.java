/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.converters;

import java.util.ArrayList;
import java.util.List;
import services.DTOS.RegistroDTO;
import services.Entities.Registro;

/**
 *
 * @author estudiante
 */
public class RegistroConverter {
    
    public static RegistroDTO entityToDTO( Registro registro){
        RegistroDTO reg = new RegistroDTO( );
        reg.setCantidadVisitas(registro.getCantidadVisitas());
        reg.setFechas(registro.getFechas());
        reg.setId(registro.getId());
        reg.setLatitud(registro.getLatitud());
        reg.setLongitud(registro.getLongitud());
        reg.setNombre(registro.getNombre());
        return reg;
    }
    
    public static Registro DTOtoEntity( RegistroDTO registro){
        Registro reg = new Registro( );
        reg.setCantidadVisitas(registro.getCantidadVisitas());
        reg.setFechas(registro.getFechas());
        reg.setLatitud(registro.getLatitud());
        reg.setLongitud(registro.getLongitud());
        reg.setNombre(registro.getNombre());
        return reg;
    }
    
    public static List<RegistroDTO> entityToDtoList( List<Registro> lista){
        List<RegistroDTO> listaN = new ArrayList<RegistroDTO>();
        int size = lista.size();
        for(int i=0; i<size;i++){
            Registro u = (Registro) lista.get(i);
            listaN.add(entityToDTO(u));
        }
        return listaN;
    }
}
