/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.colecciones;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Administrador
 */
public class SucesoHistorico implements Comparable<SucesoHistorico> {
    
    private Date fecha;
    
    private String nombre;
    
    private String descripcion;
    
    public SucesoHistorico(int anyo, int mes, int dia, 
                           String nombre, String descripcion) {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.set(Calendar.YEAR, anyo);
        calendario.set(Calendar.MONTH, mes-1);
        calendario.set(Calendar.DAY_OF_MONTH, dia);
        this.fecha = calendario.getTime();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(SucesoHistorico otro) {
        int orden;
        
        if (this.fecha.getTime() > otro.fecha.getTime()) {
            orden = +1;
        } else if (this.fecha.getTime() < otro.fecha.getTime()) {
            orden = -1;
        } else {
            orden = this.nombre.compareTo(otro.nombre);
        }
        
        return orden;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SucesoHistorico other = (SucesoHistorico) obj;
        if (this.fecha != other.fecha && (this.fecha == null || !this.fecha.equals(other.fecha))) {
            return false;
        }
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.fecha != null ? this.fecha.hashCode() : 0);
        hash = 83 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }
    
    
    
}
