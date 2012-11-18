/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.geometria;

/**
 *
 * @author Administrador
 */
public class Circulo extends Poligono {
    
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio * radio * Math.PI;
    }
    
    public double calcularPerimetro() {
        return radio * 2.0 * Math.PI;
    }
    
    
}
