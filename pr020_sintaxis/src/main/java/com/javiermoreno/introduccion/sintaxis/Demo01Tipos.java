/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.sintaxis;

import java.text.MessageFormat;


/**
 *
 * @author Administrador
 */
public class Demo01Tipos {
    
    public static void main(String[] args) {
        System.out.println("Iniciando programa.");
        
        int valor1 = 10000;
        byte valor2 = 3;
        long valor3 = valor1 / valor2;
        // short
        
        System.out.println(
                MessageFormat.format("valor3 = {0}.", valor3));
        
        double valor4 = 0.1;
        double valor5 = 0.2;
        
        System.out.println(valor4 + valor5);
        
        float valor6 = 0.1f;
        float valor7 = 0.2f;
        System.out.println(valor6 + valor7);
        
        long valor8 = (long) (valor7 / valor6);        
        System.out.println(MessageFormat.format("valor8 = {0}.", valor8));
        
        char letra1 = 'A';
        System.out.println(MessageFormat.format("Letra 1: {0}.", letra1));
        char letra2 = '\uFA0E';
        System.out.println(MessageFormat.format("Letra 2: {0}.", letra2));
        
        boolean t = true;
        boolean f = false;
        boolean r = t ^ f;
        System.out.println(MessageFormat.format("t ^ f: {0}.", r));
        
        int[] cajas = new int[4];
        System.out.println(cajas.length);
        cajas[0] = 54;
        System.out.println(cajas[0]);
        cajas = null;
        System.gc();
        
        String s1 = new String();
        System.out.println(
                MessageFormat.format("La cadena mide {0}.", s1.length()));
        char[] letrasFrase = new char[] {'H', 'o', 'l', 'a'};
        String s2 = new String(letrasFrase);
        System.out.println(
                MessageFormat.format("La cadena mide {0}.", s2.length()));
        System.out.println(
                MessageFormat.format("La primera letra de {0} es {1}.", 
                        s2, s2.charAt(0)));
        System.out.println(
                MessageFormat.format("La última letra de {0} es {1}.", 
                        s2, s2.charAt(s2.length()-1)));
//        System.out.println(
//                MessageFormat.format("La primera letra de {0} es {1}.", 
//                        s2, s2.charAt(4)));
        
        String s3 = "Mundo";
        String s4 = new String(new char[]{'M', 'u', 'n', 'd', 'o'});
        
        System.out.println(s3 == s4);
        System.out.println( s3.equals(s4) );
        String s5 = "Mundo";
        System.out.println(s3 == s5);
        String s6 = "Mun" + "do";
        System.out.println(s3 == s6);
        
        String s7 = "Esto";
        s7 = s7 + " es ";
        s7 = s7 + " un desastre";
        
        StringBuilder sb = new StringBuilder(1024*16);
        sb.append("Esto");
        sb.append(" funciona ");
        sb.append(" súper bien.");
        String s8 = sb.toString();
        System.out.println(s8);
        
        
        System.out.println("Fin.");        
    }
    
}
