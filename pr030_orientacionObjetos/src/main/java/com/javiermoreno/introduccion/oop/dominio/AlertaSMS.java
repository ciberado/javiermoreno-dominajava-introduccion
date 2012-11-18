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
public class AlertaSMS extends Alerta {
    private static final Logger log = Logger.getLogger(AlertaSMS.class);
    
    private String telefono;

    public AlertaSMS(int prioridad, String mensaje, String telefono) {
        super(prioridad, mensaje);
        this.telefono = telefono;
    }

    @Override
    public void enviar() {
        log.info("Enviando sms.");
        System.out.println("################");
        System.out.println("Ring: " + this.telefono);
        System.out.println(this.getMensaje());
        System.out.println("################");
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlertaSMS other = (AlertaSMS) obj;
        if ((this.telefono == null) ? (other.telefono != null) : !this.telefono.equals(other.telefono)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * 7 + (this.telefono != null ? this.telefono.hashCode() : 0);
        return hash;
    }

 
    
    
    
    
    
    @Override
    public String toString() {
        return  super.toString() + 
                ", teléfono: " + this.telefono;
    }
    
    
    
}
