package com.cubanoar.mistring;

public class StringSacarExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "puedeSer.unArchivo.pdf";
        /*Nos devuelve un entero con el indice de la ultima vez donde aparece <.>*/
        int ultimoPunto = archivo.lastIndexOf(".");

        System.out.println("Largo del String con archivo.length() = " + archivo.length());
        System.out.println("Sacamos una sub cadena  = " + archivo.substring(ultimoPunto + 1));
    }
}
