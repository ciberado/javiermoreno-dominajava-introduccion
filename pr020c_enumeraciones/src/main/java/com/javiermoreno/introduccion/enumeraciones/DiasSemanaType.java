/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.enumeraciones;

/**
 *
 * @author ciberado
 */
public enum DiasSemanaType {
    
    LUNES(false), MARTES(false), MIERCOLES(false),
    JUEVES(false), VIERNES(false), SABADO(true), DOMINGO(true);
    
    private boolean festivo;
    
    private DiasSemanaType(boolean esFestivo) {
        this.festivo = esFestivo;
    }

    public boolean isFestivo() {
        return festivo;
    }
    
    
    
}
