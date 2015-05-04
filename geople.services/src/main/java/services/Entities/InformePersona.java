/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author estudiante
 */
@Entity
public class InformePersona implements Serializable{
   
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int cantidadTotal;
    
    private int cantidadEdad;
    
    private int cantidadPresupuesto;
    
    
    private int cantidadSexo;
    
    
    private int otroPresupuestoI;
    
    private int otroPresupuestoF;
    
    private int otraEdadI;
    
    private int otraEdadF;

    public InformePersona(Long id, int cantidadTotal, int cantidadEdad, int cantidadPresupuesto, int cantidadDias, int otroPresupuestoI, int otroPresupuestoF, int otraEdadI, int otraEdadF) {
        this.id = id;
        this.cantidadTotal = cantidadTotal;
        this.cantidadEdad = cantidadEdad;
        this.cantidadPresupuesto = cantidadPresupuesto;
        this.otroPresupuestoI = otroPresupuestoI;
        this.otroPresupuestoF = otroPresupuestoF;
        this.otraEdadI = otraEdadI;
        this.otraEdadF = otraEdadF;
    }

    public InformePersona() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public int getCantidadEdad() {
        return cantidadEdad;
    }

    public void setCantidadEdad(int cantidadEdad) {
        this.cantidadEdad = cantidadEdad;
    }

    public int getCantidadPresupuesto() {
        return cantidadPresupuesto;
    }

    public void setCantidadPresupuesto(int cantidadPresupuesto) {
        this.cantidadPresupuesto = cantidadPresupuesto;
    }


    public int getCantidadSexo() {
        return cantidadSexo;
    }

    public void setCantidadSexo(int cantidadSexo) {
        this.cantidadSexo = cantidadSexo;
    }

    public int getOtroPresupuestoI() {
        return otroPresupuestoI;
    }

    public void setOtroPresupuestoI(int otroPresupuestoI) {
        this.otroPresupuestoI = otroPresupuestoI;
    }

    public int getOtroPresupuestoF() {
        return otroPresupuestoF;
    }

    public void setOtroPresupuestoF(int otroPresupuestoF) {
        this.otroPresupuestoF = otroPresupuestoF;
    }

    public int getOtraEdadI() {
        return otraEdadI;
    }

    public void setOtraEdadI(int otraEdadI) {
        this.otraEdadI = otraEdadI;
    }

    public int getOtraEdadF() {
        return otraEdadF;
    }

    public void setOtraEdadF(int otraEdadF) {
        this.otraEdadF = otraEdadF;
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
        if(!(object instanceof InformePersona)) {
            return false;
        }
        InformePersona other = (InformePersona) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.Entities.InformePersona[ id=" + id + " ]";
    }
}
