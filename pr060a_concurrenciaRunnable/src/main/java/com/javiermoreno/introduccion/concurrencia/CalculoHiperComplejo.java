/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.concurrencia;

/**
 *
 * @author Administrador
 */
public class CalculoHiperComplejo implements Runnable {

    public CalculoHiperComplejo() {
    }
    
    public void calcular() {
        System.out.println("Iniciando cálculo CalculoHiperComplejo.");
        try {
            Thread.sleep(1000*012);
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.err);
        }
        System.out.println("Finalizado cálculo CalculoHiperComplejo.");
    }

    @Override
    public void run() {
        this.calcular();
    }
    
    
    
}
