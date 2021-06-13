package com.cubanoar.mistring;

public class StringMetodos {
    public static void main(String[] args) {
        
        String str1 = "Pancholo";

        System.out.println("Largo = " + str1.length());
        System.out.println("A Mayuscula = " + str1.toUpperCase());
        System.out.println("A Minuscula = " + str1.toLowerCase());

        System.out.println("Comparamos con .equals(\"Pancholo\") = " + str1.equals("Pancholo"));
        System.out.println("Comparamos con .equals(\"pancholo\") = " + str1.equals("pancholo"));
        System.out.println("Comparamos con .equalsIgnoreCase(\"pancholo\") = "
                + str1.equalsIgnoreCase("Pancholo"));
        //Devuelve un entero
        System.out.println("Comparamos con .compareTo(\"Pancholo\") = " + str1.compareTo("Pancholo"));
        System.out.println("Comparamos con .compareTo(\"Paco\") = " + str1.compareTo("paco"));

        System.out.println("Imprime el caracter en la posicion 0 .charAt(0) = " + str1.charAt(0));
        System.out.println("Imprime el caracter en la posicion 1 .charAt(1) = " + str1.charAt(1));
        System.out.println("Imprime el caracter en la ultima posicion .charAt(str1.length()-1) = "
                + str1.charAt(str1.length()-1));

        System.out.println(" Imprime subcadena desde la posicion 1 str1.substring(1) = " + str1.substring(1));
        System.out.println("Imprime subcadena desde la posicion 1 a 3 str1.substring(1, 4) = " + str1.substring(1, 4));
        System.out.println("Imprime subcadena desde la posicion str1.substring(str1.length()-2) = " + str1.substring(str1.length()-2));

        String unaCadenaParaMi = "unaCadenaParaMi";
        System.out.println("Reemplaza <a> por <.> = " + unaCadenaParaMi.replace("a", "."));
        System.out.println("No lo cambia al original = " + unaCadenaParaMi);
        System.out.println("No devuelve el indice de la primera aparicion de <a> .indexOf('a') = " + unaCadenaParaMi.indexOf('a'));
        System.out.println("Nos devuelve la ultimo indice donde aparece <a> .lastIndexOf('a') = " + unaCadenaParaMi.lastIndexOf('a'));
        //Valor negativo si no la encuentra
        System.out.println("Imprime donde empieza la cadena .indexOf('ena') = " + unaCadenaParaMi.indexOf("ena"));

        System.out.println("Nos devuelve true o false .contains('ara') = " + unaCadenaParaMi.contains("ara"));
        System.out.println("True o False si comienza con .startsWith(\"un\") = " + unaCadenaParaMi.startsWith("un"));
        System.out.println("True o False si termina con .endsWith(\"i\") = " + unaCadenaParaMi.endsWith("i"));
        System.out.println("  unaCadenaParaMi ");
        //El <.trim> elimina los espacios
        System.out.println("  unaCadenaParaMi ".trim());
        
    }
}
