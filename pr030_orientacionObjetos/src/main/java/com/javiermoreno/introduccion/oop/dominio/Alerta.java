/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.oop.dominio;

import org.apache.log4j.Logger;

/**
 *
 * @author Administrador
 */
public abstract class Alerta {
    private static final Logger log = Logger.getLogger(Alerta.class);
    
    private int prioridad;
    private String mensaje;

    public Alerta(int prioridad, String mensaje) {
        super();
        log.debug("Creando nueva alerta.");
        this.setPrioridad(prioridad);
        this.mensaje = mensaje;
        
    }

    public abstract void enviar();    
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        if ((prioridad < 1) || (prioridad > 10)) {
            log.warn("Error: prioridad no válida!!!!");
            IllegalArgumentException informeError = 
                    new IllegalArgumentException("Prioridad fuera de rango.");
            throw informeError;
        }
        this.prioridad = prioridad;
    }

    
    
    
    @Override
    public String toString() {
        return "mensaje: " + this.mensaje + 
               ", prioridad: " + this.prioridad;
    }       
           
    
    
}





