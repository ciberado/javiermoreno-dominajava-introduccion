/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.colecciones;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Administrador
 */

public class Demo02ListPrimitivasClasica {
    
    public static void main(String[] args) {
        
        List ventaEntradas = new ArrayList();
        Integer entradas0 = new Integer(100);
        ventaEntradas.add(entradas0);
        ventaEntradas.add(new Integer(50));
        ventaEntradas.add(new Integer(560));
        ventaEntradas.add(new Integer(10));
        ventaEntradas.add(new Integer(20));
         
        Integer suma = new Integer(0);
        for (int idx = 0; idx < ventaEntradas.size(); idx++) {
            Integer ventaActual = (Integer) ventaEntradas.get(idx);
            int sumaPrimitiva = suma.intValue() + ventaActual.intValue();
            suma = new Integer(sumaPrimitiva);
        }
        
        System.out.println("SUMA: " + suma.toString());
        
        
        Integer entradasVendidas0 = (Integer) ventaEntradas.get(0);
        System.out.println(entradasVendidas0.intValue() * 2);
    }
    
}
