/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.colecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Demo01List {

    public static void main(String[] args) {
        
        //List<String> lista1 = new ArrayList<String>();
        List<String> lista1 = new LinkedList<String>();
        lista1.add("Trompeta");
        lista1.add("Saxo");
        lista1.add("Chelo");
        lista1.add("Bajo");
        lista1.add("Trompeta");

        System.out.println(lista1.size());
        String saxo = lista1.get(1);
        System.out.println(saxo);
        
        for (String instrumento : lista1) {
            System.out.println(instrumento);
        }
        
        Iterator<String> iterLista1 = lista1.iterator();
        while (iterLista1.hasNext() == true) {
            System.out.println(iterLista1.next());
        }
        
        for (Iterator<String> iter = lista1.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
    
}
