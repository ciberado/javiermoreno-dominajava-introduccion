/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.enumeraciones;

/**
 *
 * @author ciberado
 */
public class DiasSemana {

    //<editor-fold>
    public static final DiasSemana LUNES =
            new DiasSemana(0, "Lunes");
    public static final DiasSemana MARTES  =
            new DiasSemana(1, "Martes");
    public static final DiasSemana MIERCOLES =
            new DiasSemana(2, "Miercoles");
    public static final DiasSemana JUEVES =
            new DiasSemana(3, "Jueves");
    public static final DiasSemana VIERNES =
            new DiasSemana(4, "Viernes");
    public static final DiasSemana SABADO =
            new DiasSemana(5, "Sabado");
    public static final DiasSemana DOMINGO  =
            new DiasSemana(6, "Domingo");
    //</editor-fold>
    
    private int ordinal;
    private String nombre;

    private DiasSemana(int ordinal, String nombre) {
        this.ordinal = ordinal;
        this.nombre = nombre;
    }
    
    public static DiasSemana[] values() {
        return new DiasSemana[] {
                LUNES, MARTES, MIERCOLES, JUEVES,
                VIERNES, SABADO, DOMINGO};
    }

    public String getNombre() {
        return nombre;
    }

    public int getOrdinal() {
        return ordinal;
    }
    
    
    
    
}
