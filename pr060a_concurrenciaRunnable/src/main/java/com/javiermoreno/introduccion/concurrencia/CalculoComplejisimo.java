/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class CalculoComplejisimo implements Runnable {

    public CalculoComplejisimo() {
    }
    
    public void ejecutar() {
        System.out.println("Iniciando cálculo complejísimo.");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.err);
        }
        System.out.println("Finalizado cálculo complejísimo.");
    }

    @Override
    public void run() {
        this.ejecutar();
    }
    
    
    
}
