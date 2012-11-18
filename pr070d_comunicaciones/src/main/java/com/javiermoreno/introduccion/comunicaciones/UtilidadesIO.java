/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.comunicaciones;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Administrador
 */
public class UtilidadesIO {

    public static void cerrar(Closeable... recursos) {
        for (Closeable recursoActual : recursos) {
            if (recursoActual != null) {
                try {
                    recursoActual.close();
                } catch (IOException exc) {
                    exc.printStackTrace(System.out);
                }
            }
        }
    }

    public static void cerrarDinamico(Object... recursos) {

        for (Object recursoActual : recursos) {
            if (recursoActual != null) {
                try {
                    Class clazz = recursoActual.getClass();
                    Method closeMethod = clazz.getDeclaredMethod("close");
                    if (closeMethod != null) {
                        closeMethod.setAccessible(true);
                        closeMethod.invoke(recursoActual);
                    }
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                } catch (InvocationTargetException ex) {
                    ex.printStackTrace();
                } catch (NoSuchMethodException ex) {
                    ex.printStackTrace();
                } catch (SecurityException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
    
    
}
