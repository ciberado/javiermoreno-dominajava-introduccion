/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.oop.dominio;

import java.util.Comparator;

/**
 *
 * @author Administrador
 */
public class AlertaPorPrioridadDescComparator 
implements Comparator<Alerta> {

    @Override
    public int compare(Alerta a1, Alerta a2) {
       int orden = a1.getPrioridad() - a2.getPrioridad();
       
       if (orden == 0) {    
           String m1 = a1.getMensaje();
           String m2 = a2.getMensaje();
           orden = m1.compareTo(m2);
       }
       
       return orden * -1;
    }
    


    
}
