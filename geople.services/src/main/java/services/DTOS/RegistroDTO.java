/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DTOS;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class RegistroDTO {
    
    private Long id;
    
    private long longitud;
    
    private long latitud;
    
    private String nombre;
    
    private List<Date> fechas;
    
    private int cantidadVisitas;
    
    private List<String> diasSemana;

    public RegistroDTO(Long id, long longitud, long latitud, String nombre, String diaSemana, Date fecha) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.nombre = nombre;
        this.id = id;
        cantidadVisitas = 1;
        fechas = new ArrayList<Date>();
        fechas.add(fecha);
    }

    public RegistroDTO() {
        fechas = new ArrayList<Date>();
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Date> getFechas() {
        return fechas;
    }

    public void setFechas(List<Date> fechas) {
        this.fechas = fechas;
    }

    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    
    public void agregarVisita( Date fecha){
        fechas.add(fecha);
        cantidadVisitas++;
    }
    
}
