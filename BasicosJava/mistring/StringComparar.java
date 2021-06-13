package com.cubanoar.mistring;

public class StringComparar {
    public static void main(String[] args) {
        String str1 = "Esto es un String";

        //Creamos con Operador <new>
        String str2 = new String( "Esto es un String");


        boolean sonIguales = str1 == str2;
        System.out.println("str1 == str2 = " + sonIguales);

        //Para comparar el contenido debemos usar <.equals()>
        sonIguales = str1.equals(str2);
        System.out.println("str1.equals(str2) = " + sonIguales);

        String str3 =  "Esto es un String";
        sonIguales = str1 == str3;
        System.out.println("str1 == str3 = " + sonIguales);

    }
}
