package com.cubanoar.mistring;

public class StringMetodosArreglo {
    public static void main(String[] args) {
        
        //Creamos el String
        String unaCadena = "unaCadena";
        //Imprime el largo del string
        System.out.println("unaCadena.length() = " + unaCadena.length());

        //Creamos el arreglo de caracteres
        char[] arregloChar = unaCadena.toCharArray();
        //Guardamos en largoArreglo el largo del arregloChar
        int largoarreglo = arregloChar.length;
        System.out.println("largoarreglo = " + largoarreglo);
        //Recorremos el arreglo con un for
        for(int i = 0; i < largoarreglo; i++){
            System.out.print(arregloChar[i]);
        }

        System.out.println();
        //Con un forEach
        for (char a :
                arregloChar) {
            System.out.print(a);
        }

        System.out.println();

        /*Nos devuelve un arreglo de Strings, divide la cadena principal por el patron que le pasemos al split*/
        String[] arregloConSplit = unaCadena.split("a");
        int l = arregloConSplit.length;
        //Recorremos con un for
        for(int j=0; j<l; j++){
            System.out.println(arregloConSplit[j]);
        }

        String archivo = "algun.archivo.txt";
        /*Creamos arreglo separando por <.> debemos ponerlo con <\\.>*/
        String[] archivoArr = archivo.split("\\.");
        l = archivoArr.length;
        System.out.println("l = " + l);
        for(int j=0; j < l; j++){
            System.out.println(archivoArr[j]);
        }
        /*Con el l-1 accedemos al ultimo lugar del arreglo*/
        System.out.println("extension = " + archivoArr[l-1]);
    }
}
