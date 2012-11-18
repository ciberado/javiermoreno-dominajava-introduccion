/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.concurrencia;

/**
 *
 * @author Administrador
 */
public class Consumidor extends Thread {
    
    private Cubo cubo;

    public Consumidor(Cubo cubo) {
        this.cubo = cubo;
    }

    @Override
    public void run() {
        System.out.println(cubo.vaciar());
        System.out.println(cubo.vaciar());
        System.out.println(cubo.vaciar());
    }
    
    
    
}
