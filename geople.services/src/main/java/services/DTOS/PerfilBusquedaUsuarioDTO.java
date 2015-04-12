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
    //Constantes
    //-----------------------------------------------------
    
    public final static int FEMENINO=0;
    
    public final static int MASCULINO=1;
    
    //-----------------------------------------------------
    //Atributos
    //-----------------------------------------------------
    
    private int sexo;
    
    private int edadInicial;
    
    private int edadFinal;
    
    private int presupuestoInicial;
    
    private int presupuestoFinal;
    
    private int radio;
    
    private String longitud;
    
    private String latitud;
    
    private ArrayList<String> intereses;
    
    
    
    //-----------------------------------------------------
    //Constructor
    //-----------------------------------------------------
    
    public PerfilBusquedaUsuarioDTO() {
    }
    
    //-----------------------------------------------------
    //Metodos
    //-----------------------------------------------------

   
    
    
}
