package com.cubanoar.operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int num1 = 5, num2 = 4, sumaAmbos = num1 + num2;

        System.out.println("sumaAmbos = " + sumaAmbos);

        //Debemos encerrar entre parentesis <num1 + num2> para que funcione
        System.out.println("num1 + num2 = " + (num1 + num2));
        
        int restaAmbos = num1 - num2;
        System.out.println("restaAmbos = " + restaAmbos);
        //Debemos encerrar entre parentesis <num1 - num2> para que funcione
        System.out.println("(num1 - num2) = " + (num1 - num2));

        int multiplicacion = num1 * num2;
        System.out.println("multiplicación = " + multiplicacion);
        
        int division = num1 / num2;
        //Pasamos los int a float, hacemos la division y guardamos en float
        float division1 = (float) num1 / (float)num2;
        System.out.println("division = " + division);
        System.out.println("division1 = " + division1);

        //Muy util cuando queremos saber si un numero es par, ya que su resto seria 0
        int resto = num1 % num2;
        System.out.println("resto = " + resto);
        
        resto = 8 % 2;
        System.out.println("Numero par con resto 0 = " + resto);

        //Abre ventana para ingresar un numero y nos dice si es par o impar
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if(num3 % 2 == 0){
            System.out.println("numero par = " + num3);
        } else {
            System.out.println("numero impar = " + num3);
        }
    }
}
