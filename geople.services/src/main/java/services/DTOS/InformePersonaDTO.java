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
public class InformePersonaDTO {
    
    private Long id;
    
    private int cantidadTotal;
    
    private int cantidadEdad;
    
    private int cantidadPresupuesto;
    
    
    private int cantidadSexo;
    
    
    private int otroPresupuestoI;
    
    private int otroPresupuestoF;
    
    private int otraEdadI;
    
    private int otraEdadF;

    public InformePersonaDTO(Long id, int cantidadTotal, int cantidadEdad, int cantidadPresupuesto, int cantidadSexo, int otroPresupuestoI, int otroPresupuestoF, int otraEdadI, int otraEdadF) {
        this.id = id;
        this.cantidadTotal = cantidadTotal;
        this.cantidadEdad = cantidadEdad;
        this.cantidadPresupuesto = cantidadPresupuesto;
        this.cantidadSexo = cantidadSexo;
        this.otroPresupuestoI = otroPresupuestoI;
        this.otroPresupuestoF = otroPresupuestoF;
        this.otraEdadI = otraEdadI;
        this.otraEdadF = otraEdadF;
    }

    public InformePersonaDTO() {
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
 
}
