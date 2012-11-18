/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.geometria;

/**
 *
 * @author Administrador
 */
public class Triangulo extends Poligono {
    
    private double ancho;
    private double alto;

    public Triangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto / 2;
    }
    
    
    
}
