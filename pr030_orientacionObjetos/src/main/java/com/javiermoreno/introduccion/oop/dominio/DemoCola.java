/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.oop.dominio;

import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Administrador
 */
public class DemoCola {
    
    public static void main(String[] args) {
        
        //PropertyConfigurator.configure("log4j.properties");
        
        ColaDeAlertas cola1 = 
                new ColaDeAlertas("alertasDelDia");
        
        cola1.registrarAlerta(
            new AlertaMail(3, "Wop 3", "wop@gmail.com"));
        
        Alerta a1 = new AlertaSMS(
                1, "Wop 1", "655 1020");
        cola1.registrarAlerta(a1);
        
        cola1.registrarAlerta(
            new AlertaMail(4, "Wop 4", "wop@gmail.com"));
        
        Alerta a2 = new AlertaMail(
                2, "Wop", "email@javier-moreno.com");
        cola1.registrarAlerta(a2);

        cola1.registrarAlerta(
            new AlertaMail(5, "Wop 5", "wop@gmail.com"));
        
        cola1.lanzarAlertas();
        
        
        
    }
    
}
