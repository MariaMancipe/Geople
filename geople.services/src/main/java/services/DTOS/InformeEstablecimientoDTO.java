/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DTOS;

/**
 *
 * @author estudiante
 */
public class InformeEstablecimientoDTO {
    
    private Long id;
    
    private int cantidadTotal;
    
    private int cantidadTipo;
    
    private int cantidadEspecialidad;
    
    private int cantidadPresupuesto;
    
    private String otraEspecialidad;
    
    private int otroPresupuestoI;
    
    private int otroPresupuestoF;
    
    private int otroTipo;

    public InformeEstablecimientoDTO(Long id, int cantidadTotal, int cantidadTipo, int cantidadEspecialidad, int cantidadPresupuesto, String otraEspecialidad, int otroPresupuestoI, int otroPresupuestoF, int otroTipo) {
        this.id = id;
        this.cantidadTotal = cantidadTotal;
        this.cantidadTipo = cantidadTipo;
        this.cantidadEspecialidad = cantidadEspecialidad;
        this.cantidadPresupuesto = cantidadPresupuesto;
        this.otraEspecialidad = otraEspecialidad;
        this.otroPresupuestoI = otroPresupuestoI;
        this.otroPresupuestoF = otroPresupuestoF;
        this.otroTipo = otroTipo;
    }

    public InformeEstablecimientoDTO() {
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

    public int getCantidadTipo() {
        return cantidadTipo;
    }

    public void setCantidadTipo(int cantidadTipo) {
        this.cantidadTipo = cantidadTipo;
    }

    public int getCantidadEspecialidad() {
        return cantidadEspecialidad;
    }

    public void setCantidadEspecialidad(int cantidadEspecialidad) {
        this.cantidadEspecialidad = cantidadEspecialidad;
    }

    public int getCantidadPresupuesto() {
        return cantidadPresupuesto;
    }

    public void setCantidadPresupuesto(int cantidadPresupuesto) {
        this.cantidadPresupuesto = cantidadPresupuesto;
    }

    public String getOtraEspecialidad() {
        return otraEspecialidad;
    }

    public void setOtraEspecialidad(String otraEspecialidad) {
        this.otraEspecialidad = otraEspecialidad;
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

    public int getOtroTipo() {
        return otroTipo;
    }

    public void setOtroTipo(int otroTipo) {
        this.otroTipo = otroTipo;
    }
    
    
    
}
