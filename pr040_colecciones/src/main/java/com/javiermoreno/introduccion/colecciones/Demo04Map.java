/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 *
 * @author Administrador
 */
public class Demo04Map {

    public static void main(String[] args) {
        
        Persona per1 = new Persona("47601661V", "Alice");
        Persona per2 = new Persona("12345678A", "Bob");
        Persona per3 = new Persona("88888888C", "Charlie");
        
        Map<String, Persona> mapa = 
                new HashMap<String, Persona>();
        
        mapa.put("47610661V", per1);
        mapa.put(per2.getNif(), per2);
        mapa.put(per3.getNif(), per3);
        
        Persona persona = mapa.get("88888888C");
        System.out.println(persona.getNombre());
        
        System.out.println("Valores:");
        Collection<Persona> valores = mapa.values();
        for (Persona personaActual : valores) {
            System.out.println(personaActual.getNombre());
        }
        
        System.out.println("Claves:");
        Set<String> claves = mapa.keySet();
        for (String claveActual : claves) {
            Persona personaActual = mapa.get(claveActual);
            System.out.println(claveActual + ": " +
                               personaActual.getNombre());
        }
        
        System.out.println("Entries:");
        Set<Entry<String, Persona>> entradas = mapa.entrySet();
        for (Entry<String, Persona> entradaActual : entradas) {
            System.out.println(entradaActual.getKey() + "= "
                              +entradaActual.getValue().getNombre());
        }
    }
}
class Persona {
    private String nif;
    private String nombre;

    public Persona(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
