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
import services.DTOS.BusquedaDTO;
import services.DTOS.RegistroDTO;

/**
 *
 * @author estudiante
 */
@Entity
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int edad;
    
    private String sexo;
    
    private String nombre;
    
    private String correo;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int presupuestoI;
    
    private int presupuestoF;
    
    @OneToMany
    private List<Registro> lugares;
    
    @OneToMany
    private List<Busqueda> busquedas;
    
    private List<String> intereses;

    public Usuario(int edad, String sexo, String nombre, String correo, Long id, int presupuestoI, int presupuestoF, ArrayList<String> nIntereses) {
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.presupuestoI = presupuestoI;
        this.presupuestoF = presupuestoF;
        busquedas = new ArrayList<Busqueda>();
        lugares = new ArrayList<Registro>();
        intereses = nIntereses;   
    }

    public Usuario() {
        busquedas = new ArrayList<Busqueda>();
        lugares = new ArrayList<Registro>();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Registro> getLugares() {
        return lugares;
    }

    public void setLugares(List<Registro> lugares) {
        this.lugares = lugares;
    }

    public List<Busqueda> getBusquedas() {
        return busquedas;
    }

    public void setBusquedas(List<Busqueda> busquedas) {
        this.busquedas = busquedas;
    }

    public List<String> getIntereses() {
        return intereses;
    }

    public void setIntereses(List<String> intereses) {
        this.intereses = intereses;
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
        if(!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.Entities.Usuario[ id=" + id + " ]";
    }
    
    
    
}
