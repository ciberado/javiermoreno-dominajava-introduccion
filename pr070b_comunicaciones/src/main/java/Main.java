/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.javiermoreno.introduccion.comunicaciones.ServidorHorario;
import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {
            System.out.println("Iniciando servidor.");
            ServidorHorario servidor = 
                    new ServidorHorario(777);
            servidor.ejecutar();
            System.out.println("Finalizado servidor.");
        } catch (IOException exc) {
            System.out.println("ERROR: " + exc.getMessage());
        }
        
        
    }
    
}
