/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.javiermoreno.introduccion.concurrencia.Consumidor;
import com.javiermoreno.introduccion.concurrencia.Cubo;
import com.javiermoreno.introduccion.concurrencia.Productor;

/**
 *
 * @author Administrador
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Iniciando.");
        
        Cubo cubo = new Cubo();
        Thread threadProductor = new Productor(cubo);
        Thread threadConsumidor = new Consumidor(cubo);
        
        threadProductor.start();
        threadConsumidor.start();
        try {
            threadProductor.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.err);
        }
        try {
            threadConsumidor.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.err);
        }
        
        System.out.println("Fin.");
    }
    
    
}
