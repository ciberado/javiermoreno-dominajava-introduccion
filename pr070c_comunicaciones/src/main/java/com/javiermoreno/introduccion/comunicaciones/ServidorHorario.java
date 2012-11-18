/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.comunicaciones;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class ServidorHorario {

    private int puerto;

    public ServidorHorario(int puerto) {
        this.puerto = puerto;
    }

    public void ejecutar() throws IOException {
        try (ServerSocket server = new ServerSocket(this.puerto)) {
            while (true) {
                this.procesarNuevaPeticion(server);
            }
        }
    }

    private void procesarNuevaPeticion(ServerSocket server)
            throws IOException {
        Socket socket = null;
        BufferedWriter writer = null;
        try {
            socket = server.accept();
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw =
                    new OutputStreamWriter(out);
            writer = new BufferedWriter(osw);
            Date fechaActual = new Date();
            SimpleDateFormat sdf =
                    new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            String mensaje = sdf.format(fechaActual);
            writer.write(mensaje);
            writer.flush();
        } finally {
            this.cerrarDinamico(writer, socket);
        }
    }

    private void cerrar(Closeable... recursos) {
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

    private void cerrarDinamico(Object... recursos) {

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
