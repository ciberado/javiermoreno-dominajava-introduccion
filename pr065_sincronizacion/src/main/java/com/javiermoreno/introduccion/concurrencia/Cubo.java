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
public class Cubo {

    private String contenido;

    public Cubo() {
        super();
    }

    public void llenar(String nuevoContenido) {
        synchronized (this) {
            while (this.contenido != null) {
                try {
                    this.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cubo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.contenido = nuevoContenido;
            this.notifyAll();
        }
    }

    public synchronized String vaciar() {
        while (this.contenido == null) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cubo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String resultado = this.contenido;
        this.contenido = null;
        this.notifyAll();
        return resultado;
    }
}
