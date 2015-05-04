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
public class PerfilEstablecimientoDTO {
    
    private Long id;
    
    private int area;
    
    private long longitud;
    
    private long latitud;
    
    private String tipo;
    
    private String especialidad;
    
    private int presupuestoI;
    
    private int presupuestoF;
    

    public PerfilEstablecimientoDTO(Long id, int area, long longitud, long latitud, String tipo, String especialidad, int presupuestoI, int presupuestoF) {
        this.area = area;
        this.longitud = longitud;
        this.latitud = latitud;
        this.tipo = tipo;
        this.id = id;
        this.especialidad = especialidad;
        this.presupuestoI = presupuestoI;
        this.presupuestoF = presupuestoF;
    }

    public PerfilEstablecimientoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }

    public long getLatitud() {
        return latitud;
    }

    public void setLatitud(long latitud) {
        this.latitud = latitud;
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

    public int getPresupuestoF() {
        return presupuestoF;
    }

    public void setPresupuestoF(int presupuestoF) {
        this.presupuestoF = presupuestoF;
    }    
}
