/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.concurrencia;

/**
 *
 * @author Administrador
 */
public class Productor extends Thread {
    
    private Cubo cubo;

    public Productor(Cubo cubo) {
        this.cubo = cubo;
    }

    @Override
    public void run() {
        this.cubo.llenar("camión");
        this.cubo.llenar("sugus");
        this.cubo.llenar("bicicleta");
    }
    
    
    
}
