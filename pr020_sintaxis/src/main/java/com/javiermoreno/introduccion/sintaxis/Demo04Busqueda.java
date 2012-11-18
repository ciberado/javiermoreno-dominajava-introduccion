/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.sintaxis;

/**
 *
 * @author Administrador
 */
public class Demo04Busqueda {
    
    public static void main(String[] args) {
        
        String[] palabras =
            {"Lorem", "ipsum", "dolor", "sit", "amet",
             "consectetur", "adipiscing", "elit"};
        
        int indice;
        indice = 0;
        while ((indice < palabras.length) && 
               (palabras[indice].equals("amet") == false))  {   
            indice = indice + 1;
        }
        if (indice == palabras.length) {
            System.out.println("No encontrada.");
        } else {
            System.out.println("Índice: " + indice);
        }
     

        // ......................
        
        for (indice = 0; indice < palabras.length; indice++) {
            if (palabras[indice].equals("amet") == true) {
                break;
            }
        }
        if (indice == palabras.length) {
            System.out.println("No encontrada.");
        } else {
            System.out.println("Índice: " + indice);
        }
     
        
        
    }
    
    
}
