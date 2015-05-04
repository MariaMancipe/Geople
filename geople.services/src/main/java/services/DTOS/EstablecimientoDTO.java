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
public class EstablecimientoDTO {
    
    private String nombre;
    
    private Long nit;
    
    private String tipo;
    
    private String especialidad;
    
    private int presupuestoI;
    
    private int presupuestF;
    
    private Long latitud;
    
    private Long longitud;
    

    public EstablecimientoDTO() {
        
    }

    public EstablecimientoDTO(Long latitud,Long longitud, String nombre, Long nit, String tipo, String especialidad, int presupuestoI, int presupuestF) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.nombre = nombre;
        this.nit = nit;
        this.tipo = tipo;
        this.especialidad = especialidad;
        this.presupuestoI = presupuestoI;
        this.presupuestF = presupuestF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getPresupuestoI() {
        return presupuestoI;
    }

    public void setPresupuestoI(int presupuestoI) {
        this.presupuestoI = presupuestoI;
    }

    public int getPresupuestF() {
        return presupuestF;
    }

    public void setPresupuestF(int presupuestF) {
        this.presupuestF = presupuestF;
    }

    public Long getLatitud() {
        return latitud;
    }

    public void setLatitud(Long latitud) {
        this.latitud = latitud;
    }

    public Long getLongitud() {
        return longitud;
    }

    public void setLongitud(Long longitud) {
        this.longitud = longitud;
    }
    
    
    
}
