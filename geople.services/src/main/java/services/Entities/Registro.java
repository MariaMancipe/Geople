/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author estudiante
 */
@Entity
public class Registro  implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private long longitud;
    
    private long latitud;
    
    private String nombre;
    
    @OneToMany
    private List<Date> fechas;
    
    private int cantidadVisitas;
    

    public Registro(Long id, long longitud, long latitud, String nombre, Date fecha) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.nombre = nombre;
        this.id = id;
        cantidadVisitas = 1;
        fechas = new ArrayList<Date>();
        fechas.add(fecha);
    }

    public Registro() {
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

    
    public void agregarVisita( Date fecha, String dia){
        fechas.add(fecha);
        cantidadVisitas++;
    }
    
     @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if(!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.Entities.Registro[ id=" + id + " ]";
    }
}
