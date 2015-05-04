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
import services.DTOS.PerfilEstablecimientoDTO;
import services.DTOS.PerfilPersonaDTO;

/**
 *
 * @author estudiante
 */

@Entity
public class Establecimiento implements Serializable{
    
    private static final long serialVersionUID = 1L;
   
    private String nombre;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long nit;
    
    private String tipo;
    
    private String especialidad;
    
    private int presupuestoI;
    
    private int presupuestF;
    
    private Long latitud;
    
    private Long longitud;
    
    @OneToMany
    private List<PerfilEstablecimientoDTO> perfilesE;
    
    @OneToMany
    private List<PerfilPersonaDTO> perfilesP;

    public Establecimiento() {
        
        perfilesP = new ArrayList<PerfilPersonaDTO>();
        perfilesE = new ArrayList<PerfilEstablecimientoDTO>();
    }

    public Establecimiento(Long latitud,Long longitud, String nombre, Long nit, String tipo, String especialidad, int presupuestoI, int presupuestF) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.nombre = nombre;
        this.nit = nit;
        this.tipo = tipo;
        this.especialidad = especialidad;
        this.presupuestoI = presupuestoI;
        this.presupuestF = presupuestF;
        perfilesP = new ArrayList<PerfilPersonaDTO>();
        perfilesE = new ArrayList<PerfilEstablecimientoDTO>();
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

    public List<PerfilEstablecimientoDTO> getPerfilesE() {
        return perfilesE;
    }

    public void setPerfilesE(List<PerfilEstablecimientoDTO> perfilesE) {
        this.perfilesE = perfilesE;
    }

    public List<PerfilPersonaDTO> getPerfilesP() {
        return perfilesP;
    }

    public void setPerfilesP(List<PerfilPersonaDTO> perfilesP) {
        this.perfilesP = perfilesP;
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nit != null ? nit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Establecimiento)) {
            return false;
        }
        Establecimiento other = (Establecimiento) object;
        if((this.nit == null && other.nit != null) || (this.nit != null && !this.nit.equals(other.nit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.Entities.Establecimiento[ id=" + nit + " ]";
    }
    
    
}
