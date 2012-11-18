/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.geometria;

/**
 *
 * @author Administrador
 */
public class Rectangulo extends Poligono {
    
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return this.ancho * this.alto;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }
    
    
    
    
}
