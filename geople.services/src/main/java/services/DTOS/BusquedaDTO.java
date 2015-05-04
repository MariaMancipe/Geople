/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DTOS;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public class BusquedaDTO {
    
    private Long id;
    
    private String nombre;
    
    private int cantidadPersonas;
    
    private Date fecha;

    public BusquedaDTO(Long id, String nombre, int cantidadPersonas, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadPersonas = cantidadPersonas;
        this.fecha = fecha;
    }

    public BusquedaDTO() {
    }
 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }   
}
