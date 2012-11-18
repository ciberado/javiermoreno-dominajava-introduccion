/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.comunicaciones;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class ProcesarConexionClienteThread extends Thread {

    private Socket socket;

    public ProcesarConexionClienteThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedWriter writer = null;
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw =
                    new OutputStreamWriter(out);
            writer = new BufferedWriter(osw);
            while (true) {
                Date fechaActual = new Date();
                SimpleDateFormat sdf =
                        new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                String mensaje = sdf.format(fechaActual);
                writer.write(mensaje);
                writer.newLine();
                writer.flush();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        } catch (IOException exc) {
            exc.printStackTrace(System.err);
        } finally {            
            UtilidadesIO.cerrarDinamico(writer, socket);
        }

    }
}
