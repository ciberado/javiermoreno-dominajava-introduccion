/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.comunicaciones;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
    
    public void ejecutar() 
    throws IOException {
        ServerSocket server = null;
        Socket socket = null;
        BufferedWriter writer = null;
        try {
            server = new ServerSocket(this.puerto);
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
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException exc) {      
                    exc.printStackTrace(System.err);
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException exc) {                    
                    exc.printStackTrace(System.err);
                }
            }
            if (server != null) {
                try {
                    server.close();
                } catch (IOException exc) {                    
                    exc.printStackTrace(System.err);
                }
            }
        }        
    }
    
    
}
