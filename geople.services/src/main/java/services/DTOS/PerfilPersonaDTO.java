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
public class PerfilPersonaDTO {
    
    private Long id;
    
    private int area;
    
    private long longitud;
    
    private long latitud;
    
    private int edadI;
    
    private int edadF;
    
    private int presupuestoI;
    
    private int presupuestoF;
    
    private String sexo;
    
   

    public PerfilPersonaDTO( Long id, int area, long longitud, long latitud, int edadI, int edadF, int presupuestoI, int presupuestoF, String sexo) {
        this.id = id;
        this.area = area;
        this.longitud = longitud;
        this.latitud = latitud;
        this.edadI = edadI;
        this.edadF = edadF;
        this.presupuestoI = presupuestoI;
        this.presupuestoF = presupuestoF;
        this.sexo = sexo;
    }

    public PerfilPersonaDTO() {
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

    public int getEdadI() {
        return edadI;
    }

    public void setEdadI(int edadI) {
        this.edadI = edadI;
    }

    public int getEdadF() {
        return edadF;
    }

    public void setEdadF(int edadF) {
        this.edadF = edadF;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }  
}
