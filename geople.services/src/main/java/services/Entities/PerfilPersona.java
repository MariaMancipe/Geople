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
import services.DTOS.InformePersonaDTO;

/**
 *
 * @author estudiante
 */
@Entity
public class PerfilPersona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int area;
    
    private long longitud;
    
    private long latitud;
    
    private int edadI;
    
    private int edadF;
    
    private int presupuestoI;
    
    private int presupuestoF;
    
    private String sexo;
    
    @OneToMany
    private List<InformePersonaDTO> informes;

    public PerfilPersona( Long id, int area, long longitud, long latitud, int edadI, int edadF, int presupuestoI, int presupuestoF, String sexo) {
        this.id = id;
        this.area = area;
        this.longitud = longitud;
        this.latitud = latitud;
        this.edadI = edadI;
        this.edadF = edadF;
        this.presupuestoI = presupuestoI;
        this.presupuestoF = presupuestoF;
        this.sexo = sexo;
        informes = new ArrayList<InformePersonaDTO>();
    }

    public PerfilPersona() {
        informes = new ArrayList<InformePersonaDTO>();
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

    public List<InformePersonaDTO> getInformes() {
        return informes;
    }

    public void setInformes(List<InformePersonaDTO> informes) {
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
        if(!(object instanceof PerfilPersona)) {
            return false;
        }
        PerfilPersona other = (PerfilPersona) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.Entities.PerfilPersona[ id=" + id + " ]";
    }
}
