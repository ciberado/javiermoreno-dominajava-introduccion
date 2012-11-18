/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.javiermoreno.introduccion.entradasalida.Compresor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {        
        if (args.length == 1) {      
            
            try {
                Compresor compresor = new Compresor(args[0]);
                compresor.ejecutar();
                new File(args[0]).delete();
            } catch (FileNotFoundException exc) {
                System.err.println("ERROR! Fichero no encontrado.");
            } catch (IOException exc) {
                System.err.println("ERROR de sistema, reinténtelo.");
            }       
            
        } else {
            System.out.println("Argumentos insuficientes.");
        }       
    
    }
    
}
