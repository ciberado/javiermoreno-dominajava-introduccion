/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.oop.dominio;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrador
 */
public class ColaDeAlertas {

    private static final Logger log = Logger.getLogger(ColaDeAlertas.class);
    
    
    private String nombre;
    
    Comparator<Alerta> comp = 
            new AlertaPorPrioridadDescComparator();
    
    private Set<Alerta> alertasPendientesEnvio = 
            new TreeSet<Alerta>(comp);

    public ColaDeAlertas(String nombre) {
        log.info("Inicializando cola de alertas " + nombre + ".");
        this.nombre = nombre;
    }
    
    public void registrarAlerta(Alerta alerta) {
        log.debug("Registrando alerta.");
        alertasPendientesEnvio.add(alerta);
    }
    
    public void lanzarAlertas() {
        log.info("Emitiendo todas las alertas.");
        for (Alerta alertaActual : this.alertasPendientesEnvio) {
            log.debug("Emitiendo alerta " + alertaActual.getMensaje() + ".");
            alertaActual.enviar();
        }
        alertasPendientesEnvio.clear();
    }

    public int getNumeroAlertas() {
        return alertasPendientesEnvio.size();
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}


