/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.entradasalida;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Administrador
 */
public class Compresor {
    
    private String pathOrigen;

    public Compresor(String pathOrigen) {
        this.pathOrigen = pathOrigen;
    }
    
    public void ejecutar() throws IOException, FileNotFoundException {
        InputStream lectura = null;
        OutputStream  escritura = null;
        
        try {            
            lectura = new BufferedInputStream(
                            new  FileInputStream(this.pathOrigen));
            escritura = new GZIPOutputStream(
                                new FileOutputStream(pathOrigen+".gz"));
            byte[] datos = new byte[1024*32];
            int len;
            do {
                len = lectura.read(datos, 0, datos.length);
                if (len > 0) {
                    escritura.write(datos, 0, len);
                }
            } while (len != -1);
        } catch (IOException exc) {
            exc.printStackTrace(System.err);
            throw exc;
        } finally {      
            if (escritura != null) {
                try {
                    escritura.close();
                } catch (IOException exc) {                    
                    exc.printStackTrace();
                }
            }
            if (lectura != null) {
                try {
                    lectura.close();
                } catch (IOException exc) {                    
                    exc.printStackTrace();
                }
            }
        }
    }
    
    
}
