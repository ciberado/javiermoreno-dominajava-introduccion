/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javiermoreno.introduccion.sintaxis;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Administrador
 */
public class Demo05ApacheLang {

    public static void main(String[] args) {
        
        String s = "solo es cuestión de cafeína.";
        
        System.out.println(s);
        System.out.println(StringUtils.capitalize(s));
        System.out.println(StringUtils.right(s, 8));
        
    }
    
}
