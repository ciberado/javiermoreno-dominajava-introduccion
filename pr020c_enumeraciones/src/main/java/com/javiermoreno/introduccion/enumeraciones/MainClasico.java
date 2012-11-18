/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.enumeraciones;

/**
 *
 * @author ciberado
 */
public class MainClasico {

    public static void mostrarDia(DiasSemana dia) {
        System.out.println("*************" 
                        + dia.getNombre()
                        + "*************");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiasSemana hoy = DiasSemana.LUNES;
        MainClasico.mostrarDia(hoy);
        
        System.out.println();
        
        for (DiasSemana diaActual : DiasSemana.values()) {
            MainClasico.mostrarDia(diaActual);
        }
        
        DiasSemana quintoDia = DiasSemana.values()[5];
        MainClasico.mostrarDia(quintoDia);
    }
}
