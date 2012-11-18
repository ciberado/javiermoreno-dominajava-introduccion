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
public class AlertaMail extends Alerta {
    private static final Logger log = Logger.getLogger(AlertaMail.class);
    
    private String email;

    public AlertaMail(int prioridad, String mensaje, String email) {
        super(prioridad, mensaje);
        this.email = email;
    }
    
    @Override
    public void enviar() {
        log.info("Enviando mail.");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("MAIL TO: " + this.getEmail());
        System.out.println(this.getMensaje());
        System.out.println("**************");
        System.out.println("**************");
        System.out.println("**************");
        System.out.println("**************");
        System.out.println("**************");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
        
    @Override
    public String toString() {
        return  super.toString() + 
                ", email: " + this.email;
    }
    
}
