/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.factorial;

import java.math.BigInteger;

/**
 *
 * @author Administrador
 */
public class OperacionesMatematicas {

    public static BigInteger factorial(BigInteger operando) {
        BigInteger resultado;

        if (operando.equals(BigInteger.ZERO) == true) {
            resultado = new BigInteger("1");
        } else {
            resultado = new BigInteger("1");
            for (BigInteger i = new BigInteger("2");
                    i.compareTo(operando) <= 0;
                    i = i.add(new BigInteger("1"))) {
                resultado = resultado.multiply(i);
            }
        }

        return resultado;
    }

    public static long factorial(int operando) {
        long resultado;

        if (operando == 0) {
            resultado = 1;
        } else {
            resultado = 1;

            for (int i = 2; i <= operando; i++) {
                resultado = resultado * i;
            }
        }

        return resultado;
    }
}
