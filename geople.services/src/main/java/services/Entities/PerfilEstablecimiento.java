/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import services.DTOS.InformeEstablecimientoDTO;

/**
 *
 * @author estudiante
 */
@Entity
public class PerfilEstablecimiento implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int area;
    
    private long longitud;
    
    private long latitud;
    
    private String tipo;
    
    private String especialidad;
    
    private int presupuestoI;
    
    private int presupuestoF;
    
    @OneToMany
    private List<InformeEstablecimientoDTO> informes; 

    public PerfilEstablecimiento(Long id, int area, long longitud, long latitud, String tipo, String especialidad, int presupuestoI, int presupuestoF) {
        this.area = area;
        this.longitud = longitud;
        this.latitud = latitud;
        this.tipo = tipo;
        this.id = id;
        this.especialidad = especialidad;
        this.presupuestoI = presupuestoI;
        this.presupuestoF = presupuestoF;
        informes = new ArrayList<InformeEstablecimientoDTO>();
    }

    public PerfilEstablecimiento() {
        informes = new ArrayList<InformeEstablecimientoDTO>();
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

    public List<InformeEstablecimientoDTO> getInformes() {
        return informes;
    }

    public void setInformes(List<InformeEstablecimientoDTO> informes) {
        this.informes = informes;
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
        if(!(object instanceof PerfilEstablecimiento)) {
            return false;
        }
        PerfilEstablecimiento other = (PerfilEstablecimiento) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.Entities.PerfilEstablecimiento[ id=" + id + " ]";
    }
}
