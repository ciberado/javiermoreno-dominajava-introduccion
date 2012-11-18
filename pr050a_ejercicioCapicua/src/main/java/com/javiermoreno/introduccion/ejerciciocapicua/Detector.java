/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.ejerciciocapicua;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class Detector {
    
    
    private String pathOrigen;

    public Detector(String pathOrigen) {
        this.pathOrigen = pathOrigen;
    }
    
    public void ejecutar() throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(this.pathOrigen));
            String linea;
            do {
                linea = reader.readLine();
                if (linea != null) {
                    String[] palabras = linea.split("[\\s,;:\\.]");
                    for (String palabraActual : palabras) {
                        palabraActual = palabraActual.toLowerCase();
                        if (palabraActual.length() > 2 ) {
                            this.procesarPalabra(palabraActual);
                        }
                    }
                }
            } while (linea != null);
        } finally {
            if (reader != null) {
                reader.close();
            }
        }        
    }

    private void procesarPalabra(String palabra) {
        boolean capicua = true;
        for (int idx=0; idx < palabra.length() / 2; idx++) {
            if (palabra.charAt(idx) != palabra.charAt(palabra.length()-idx-1)) {
                capicua = false;
                break;
            }
        }
        if (capicua == true) {
            System.out.println("PALABRA CAPICUA: " + palabra);
        } 
        
    }
    
}
