/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.enumeraciones;

/**
 *
 * @author ciberado
 */
public class MainJava5 {
    
    public static void mostrarDia(DiasSemanaType dia) {
        System.out.println("*************" 
                        + dia.name()
                        + "*************");
    }
    
    
    public static void main(String[] args) {
        DiasSemanaType hoy = DiasSemanaType.LUNES;
        MainJava5.mostrarDia(hoy);
        
        System.out.println();
        
        for (DiasSemanaType diaActual : DiasSemanaType.values()) {
            MainJava5.mostrarDia(diaActual);
            System.out.println("¿Es festivo? " + diaActual.isFestivo());
        }
        
        DiasSemanaType quintoDia = DiasSemanaType.values()[5];
        MainJava5.mostrarDia(quintoDia);
        
        switch (quintoDia) {
            
            case LUNES : System.out.println("Lunes!"); break;
            case MARTES: System.out.println("Martes"); break;
            case SABADO: System.out.println("Sábado!"); break;
            default: System.out.println("????");
            
        }
        
    }
    
}
