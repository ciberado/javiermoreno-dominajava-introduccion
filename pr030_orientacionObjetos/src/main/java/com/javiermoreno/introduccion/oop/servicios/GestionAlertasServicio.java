/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.oop.servicios;

import com.javiermoreno.introduccion.oop.dominio.AlertaMail;
import com.javiermoreno.introduccion.oop.dominio.AlertaSMS;
import com.javiermoreno.introduccion.oop.dominio.ColaDeAlertas;

/**
 *
 * @author Administrador
 */
public class GestionAlertasServicio {
    
    protected static ColaDeAlertas cola =
            new ColaDeAlertas("COLAPRINCIPAL");
    
    public GestionAlertasServicio() {
        
    }
    
    public void crearAlertaSMS(int prioridad,
            String mensaje, String telefono) {
        
        AlertaSMS alerta = 
           new AlertaSMS(prioridad, mensaje, telefono);
        cola.registrarAlerta(alerta);
        
    }
    
    public void crearAlertaMail(int prioridad,
            String mensaje, String email) {
        if (email.endsWith("gmail.com") == false) {
            IllegalArgumentException exc =
                    new IllegalArgumentException(
                            "Solo se permite gmail.com");
            throw exc;
        }
        
        AlertaMail alerta =
                new AlertaMail(prioridad, mensaje, email);
        cola.registrarAlerta(alerta);
        
    }
    
    public void enviarTodasLasAlertas() {
        cola.lanzarAlertas();
    }
    
    
}
