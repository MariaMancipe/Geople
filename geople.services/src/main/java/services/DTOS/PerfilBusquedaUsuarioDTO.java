/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DTOS;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class PerfilBusquedaUsuarioDTO {
    
    //-----------------------------------------------------
    //Atributos
    //-----------------------------------------------------
    
    /**
     * El sexo del perfil de la persona que se busca
     * F= femenino, M=Masculo, T=todos
     */
    private String sexo;
    
    /**
     * El inicio del intervalo de la edad
     */
    private int edadInicial;
    
    /**
     * El fin del intervalo de la edad
     */
    private int edadFinal;
    
    /**
     * El inicio del intervalo del presupuesto
     */
    private int presupuestoInicial;
    
    /**
     * El fin del intervalo del presupuesto
     */
    private int presupuestoFinal;
    
    /**
     * Los metros del radio de busqueda desde las coordenadas
     * De 0 a 1km
     */
    private int radio;
    
    /**
     * La longitud de la coordenada
     */
    private String longitud;
    
    /**
     * La latitud de la coordenada
     */
    private String latitud;
    
    /**
     * Una lista de los intereses de la persona
     */
    private ArrayList<String> intereses;
    
    /**
     * El tipo de lugar que frecuenta
     * Restaurante, Bar, Almacen de ropa
     */
    private String tipoLugar;
    
    
    
    //-----------------------------------------------------
    //Constructor
    //-----------------------------------------------------
    
    public PerfilBusquedaUsuarioDTO() {
    }
    
    public PerfilBusquedaUsuarioDTO(String sexo, int edadInicial, int edadFinal, int presupuestoInicial, int presupuestoFinal, int radio, String longitud, String latitud, ArrayList<String> intereses, String tipoLugar) {
        this.sexo = sexo;
        this.edadInicial = edadInicial;
        this.edadFinal = edadFinal;
        this.presupuestoInicial = presupuestoInicial;
        this.presupuestoFinal = presupuestoFinal;
        this.radio = radio;
        this.longitud = longitud;
        this.latitud = latitud;
        this.intereses = intereses;
        this.tipoLugar = tipoLugar;
    }
    
    //-----------------------------------------------------
    //Metodos
    //-----------------------------------------------------

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdadInicial() {
        return edadInicial;
    }

    public void setEdadInicial(int edadInicial) {
        this.edadInicial = edadInicial;
    }

    public int getEdadFinal() {
        return edadFinal;
    }

    public void setEdadFinal(int edadFinal) {
        this.edadFinal = edadFinal;
    }

    public int getPresupuestoInicial() {
        return presupuestoInicial;
    }

    public void setPresupuestoInicial(int presupuestoInicial) {
        this.presupuestoInicial = presupuestoInicial;
    }

    public int getPresupuestoFinal() {
        return presupuestoFinal;
    }

    public void setPresupuestoFinal(int presupuestoFinal) {
        this.presupuestoFinal = presupuestoFinal;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public ArrayList<String> getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList<String> intereses) {
        this.intereses = intereses;
    }

    public String getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(String tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    

   
    
    
}
