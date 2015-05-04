/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DTOS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class UsuarioDTO {
    
    private int edad;
    
    private String sexo;
    
    private String nombre;
    
    private String correo;
    
    private Long id;
    
    private int presupuestoI;
    
    private int presupuestoF;

    public UsuarioDTO(int edad, String sexo, String nombre, String correo, Long id, int presupuestoI, int presupuestoF) {
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.presupuestoI = presupuestoI;
        this.presupuestoF = presupuestoF; 
    }

    public UsuarioDTO() {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPresupuestoI() {
        return presupuestoI;
    }

    public void setPresupuestoI(int presupuestoI) {
        this.presupuestoI = presupuestoI;
    }

    public int getPresupuestoF() {
        return presupuestoF;
    }

    public void setPresupuestoF(int presupuestoF) {
        this.presupuestoF = presupuestoF;
    }

}
