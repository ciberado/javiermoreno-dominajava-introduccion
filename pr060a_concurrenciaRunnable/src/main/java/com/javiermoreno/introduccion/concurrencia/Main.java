
package com.javiermoreno.introduccion.concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {
        
        long t0 = System.currentTimeMillis();
        
        System.out.println("Inicio.");
        
        CalculoComplejisimo cc = new CalculoComplejisimo();
        Thread tCC = new Thread(cc);
        tCC.start();
        
        CalculoHiperComplejo ch = new CalculoHiperComplejo();
        Thread tCH = new Thread(ch);
        tCH.start();
        try {
            tCC.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.err);
        }
        try {
            tCH.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.err);
        }
        
        System.out.println("Fin.");
        long tf = System.currentTimeMillis();
        
        System.out.println("(han pasado " + (tf-t0) + "ms)");
        
    }
    
    
}
