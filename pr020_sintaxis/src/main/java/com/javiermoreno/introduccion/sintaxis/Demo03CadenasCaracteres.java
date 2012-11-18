/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.sintaxis;

/**
 *
 * @author Administrador
 */
public class Demo03CadenasCaracteres {
    
    public static void main(String[] args) {
        
        long tiempoInicialConStrings = System.currentTimeMillis();
        
        String libro1 = "";
        for (int i=0; i < 1000; i++) {
            libro1 = libro1 + "No por mucho madrugar amanece más temprano.";
        }
                
        long tiempoFinalConStrings = System.currentTimeMillis();        
        System.out.println("Tiempo: " + 
                (tiempoFinalConStrings - tiempoInicialConStrings));
        
        
        
        long tiempoInicialStringBuilder = System.currentTimeMillis();
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < 1000; i++) {
            sb.append("No por mucho madrugar amanece más temprano.");
        }
        String libro2 = sb.toString();
        
        long tiempoFinalStringBuilder = System.currentTimeMillis();
        System.out.println("Tiempo: " +
                (tiempoFinalStringBuilder - tiempoInicialStringBuilder));
        
    }
    
}
