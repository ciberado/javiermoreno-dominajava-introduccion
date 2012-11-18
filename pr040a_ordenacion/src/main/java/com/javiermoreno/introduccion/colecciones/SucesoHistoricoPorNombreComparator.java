/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.colecciones;

import java.util.Comparator;

/**
 *
 * @author Administrador
 */
public class SucesoHistoricoPorNombreComparator 
implements Comparator<SucesoHistorico> {

    @Override
    public int compare(SucesoHistorico sh1, SucesoHistorico sh2) {
        int orden = sh1.getNombre().compareTo(sh2.getNombre());
        
        if (orden == 0) {
            orden = (int) (sh1.getFecha().getTime() - sh2.getFecha().getTime());
        }
        
        return orden;
    }
    
    
    
}
