/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.javiermoreno.introduccion.oop.dominio.Alerta;
import com.javiermoreno.introduccion.oop.dominio.AlertaMail;
import com.javiermoreno.introduccion.oop.dominio.AlertaSMS;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author Administrador
 */
public class MainAlertas {
    
    public static void mostrarInforme(Alerta alerta) {
        System.out.println("ALERTA: "); 
        System.out.println("\t" + alerta.getMensaje());
        System.out.println("\t" + alerta.getPrioridad());
        
        if (alerta instanceof AlertaSMS) {
            AlertaSMS alertaSMS = (AlertaSMS) alerta;
            System.out.println("\t" + alertaSMS.getTelefono());
        } else if (alerta instanceof AlertaMail) {
            AlertaMail alertaMail = (AlertaMail) alerta;
            System.out.println("\t" + alertaMail.getEmail());
        }
    }
    
    
    public static void main(String[] args) {
        BasicConfigurator.configure();
        
        
        AlertaSMS alerta200 = new AlertaSMS(5, "lala", "888 1234");
        Alerta alerta200bis = (Alerta) alerta200; // <-- redundante
        String s = "hola";
        // Alerta alerta200tris = (Alerta) s; // <-- no compila
        MainAlertas.mostrarInforme(alerta200);
        
        AlertaMail alerta201 = new AlertaMail(5, "lala", "cib@jv.com");
        MainAlertas.mostrarInforme(alerta201);
        
        Alerta alerta202 = new AlertaMail(5, "po", "cib2@jv.com");
        MainAlertas.mostrarInforme(alerta202);
        
        
        
        AlertaSMS aSms1 = new AlertaSMS(1, "wop", "555 8343");
        aSms1.enviar();
        
        System.out.println(aSms1 instanceof AlertaSMS);
        System.out.println(aSms1 instanceof Alerta);
        System.out.println(aSms1.getClass().getName());
        
        
        AlertaSMS aSms2 = new AlertaSMS(1, "wip", "555 9999");
        aSms2.enviar();
        
        AlertaMail aMail1 = new AlertaMail(3, "ey ey ey!", "email@jm.com");
        aMail1.enviar();
        
        Alerta aSms10 = new AlertaSMS(2, "wop", "555 6490");
        aSms10.enviar();
        Alerta aMail10 = new AlertaMail(4, "wip", "email@jav-mor.com");
        aMail10.enviar();
        
        Alerta[] alertas = {aSms10, aMail10};
        for (int idx = 0; idx < alertas.length; idx++) {
            Alerta alertaActual = alertas[idx];
            alertaActual.enviar();
        }
        
        Alerta alerta100 = new AlertaSMS(5, "wopwop", "555 3423");
        alerta100.setMensaje("wipwip");
        // alerta100.setTelefono("888 2342"); <--- no compilaa
        
        AlertaSMS alerta101 = (AlertaSMS) alerta100;
        alerta101.setTelefono("888 1234");
        alerta100.enviar();
        alerta101.enviar();

        AlertaSMS alerta300 = new AlertaSMS(1, "!!!", "54534");
        System.out.println(alerta300.toString());
     
        
        System.out.println("Gran final!!! (con explosión incluída)");
        Alerta alerta400 = new AlertaSMS(-15, "wop", "734 41231");
        System.out.println("******** NO LLEGAREMOS AQUÍ ***********");
        
    }
    
}
