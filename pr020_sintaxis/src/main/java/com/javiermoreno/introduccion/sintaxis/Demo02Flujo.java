/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.sintaxis;

/**
 *
 * @author Administrador
 */
public class Demo02Flujo {

    public static void main(String[] args) {

        System.out.println("Inicio.");

        double valor = Math.random();

        if (valor < 0.5) {
            System.out.println("********************");
            System.out.println("Primera rama del if.");
        } else {
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("Segunda rama del if (else)");
        }

        if (valor < 0.3) {
            System.out.println("Menor que 0.3");
        } else {
            if (valor < 0.6) {
                System.out.println("entre 0.3 y 0.6");
            } else {
                System.out.println("Mayor que 0.6");
            }
        }

        if (valor < 0.3) {
            System.out.println("Primera.");
        } else if (valor < 0.6) {
            System.out.println("Segunda");
        } else {
            System.out.println("Tercera.");
        }

        boolean resultado;
        if (resultado = (valor > 0.5)) {
            System.out.println("Valor es más grande que cinco.");
        }
        System.out.println("Esta vez el resultado fue: " + resultado);

        boolean flag = false;
        if (flag = false) {
            System.out.println("¿Me voy a ejecutar?");
        }


        int valorInt = (int) (Math.random() * 10);

        switch (valorInt) {
            case 0:
                System.out.println("0");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
            case 7:
                System.out.println("6 o 7");
                break;
            default:
                System.out.println("Salió otra cosa.");
                break;
        }

        for (int contador=0; contador < 10; contador = contador + 1) {
            System.out.println("Contador: " + contador);
        }

        String[] sabores = {"Ralidazo", "Enternicio", "Caralizamedolado"};
        for (int idx = 0; idx < sabores.length; idx++) {
            System.out.println("*** " + sabores[idx]);            
        }
        for (String saborActual : sabores) {
            System.out.println("###" + saborActual  );
        }
        
        int a = 100;
        for (;;) {
            System.out.println("wop!");
            a = a + 1;
            if (a == 9999) {
                break;
            }
        }
        
        while (Math.random() > 0.5) {
            System.out.println("Soy un chico con suerte.");
        }
        
        do {
            System.out.println("Afortunado one more time.");
        } while (Math.random() > 0.5);

        System.out.println("Fin");

    }
}
