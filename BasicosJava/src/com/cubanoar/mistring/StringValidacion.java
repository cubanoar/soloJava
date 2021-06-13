package com.cubanoar.mistring;

public class StringValidacion {
    public static void main(String[] args) {
        
        String str1 = null;
        
        boolean esNulo = str1 == null;

        System.out.println("esNulo = " + esNulo);

        /*Si es esNulo es verdadero le asignamos un valor a str1*/
        if(esNulo) {
            str1 = "Esto es un String";
        }

        /*Validamos que tenga un tamaño mayor a 0*/
        boolean estaVacio = str1.length() == 0;

        System.out.println("El String esta vacio:  " + estaVacio);

        /*Nos devuleve el largo de la cadena incluyendo los espacios en blanco*/
        int cant = str1.length();
        System.out.println("cant = " + cant);

        /*Lo considera vacio si length() es 0*/
        boolean esVacio2 = str1.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        /*Es mas estricto que el anterior, en cuanto a espacios en blanco y cosas raras :)*/
        boolean esBlanco = str1.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false) {
            //Sacamos el String En Mayusculas
            System.out.println(str1.toUpperCase());
            //Usamos el .concat()
            System.out.println("Bienvenido al str1 ".concat(str1));
        }
    }
}
