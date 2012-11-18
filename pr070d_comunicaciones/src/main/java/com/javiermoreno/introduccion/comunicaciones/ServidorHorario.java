/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.comunicaciones;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

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
        socket = server.accept();
        ProcesarConexionClienteThread procesador =
                new ProcesarConexionClienteThread(socket);
        procesador.start();
    }
}
