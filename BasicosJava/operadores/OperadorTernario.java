package com.cubanoar.operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        /*Operador ternario, es un if else -.-
        * condicion ? valorSiSeCumple : volarSiNoSeCumple*/
        String str1 = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("str1 = " + str1);
        
        String estadoFinal = "";
        double promediando = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        //Creamos Objeto Scanner para leer datos desde teclado
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas entre 2.0 - 7.0:");
        //Leemos el valor ingresado por teclado y almacenamos en matematicas
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0:");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0:");
        historia = s.nextDouble();

        promediando = (matematicas + ciencias + historia) / 3;
        System.out.println("promediando = " + promediando);

        estadoFinal = promediando >= 5.49 ? "Aprobado": "Rechazado";
        /* Asi seria con un if else normal
        if(promediando >= 5.49){
            estadoFinal = "Aprobado";
        } else {
            estadoFinal = "Rechazado";
        }*/
        System.out.println("estadoFinal = " + estadoFinal);

    }
}
