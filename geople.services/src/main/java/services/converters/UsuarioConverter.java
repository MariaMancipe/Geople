/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.converters;

import java.util.ArrayList;
import java.util.List;
import services.DTOS.UsuarioDTO;
import services.Entities.Usuario;

/**
 *
 * @author estudiante
 */
public class UsuarioConverter {
    
    public static Usuario dtoToEntity( UsuarioDTO udto){
        Usuario nuevo = new Usuario( );
        nuevo.setCorreo(udto.getCorreo());
        nuevo.setEdad(udto.getEdad());
        nuevo.setNombre(udto.getNombre());
        nuevo.setPresupuestoF(udto.getPresupuestoF());
        nuevo.setPresupuestoI(udto.getPresupuestoI());
        nuevo.setSexo(udto.getSexo());
        return nuevo;
    }
    
    public static UsuarioDTO entityToDto( Usuario udto){
        UsuarioDTO nuevo = new UsuarioDTO( );
        nuevo.setId(udto.getId());
        nuevo.setCorreo(udto.getCorreo());
        nuevo.setEdad(udto.getEdad());
        nuevo.setNombre(udto.getNombre());
        nuevo.setPresupuestoF(udto.getPresupuestoF());
        nuevo.setPresupuestoI(udto.getPresupuestoI());
        nuevo.setSexo(udto.getSexo());
        return nuevo;
    }
    
    public static List<UsuarioDTO> entityToDtoList( List<Usuario> lista){
        List<UsuarioDTO> listaN = new ArrayList<UsuarioDTO>();
        int size = lista.size();
        for(int i=0; i<size;i++){
            Usuario u = (Usuario) lista.get(i);
            listaN.add(entityToDto(u));
        }
        return listaN;
    }
    
}
