package com.cubanoar.operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1 + 4;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        num1 += 2; // num1 = num1 + 2
        System.out.println("num1 = " + num1);

        num1 += 5; // num1 = num1 + 5
        System.out.println("num1 = " + num1);
        
        num2 -= 4; // num2 = num2 - 4
        System.out.println("num2 = " + num2);
        
        num2 *= 3; // num2 = num2 * 3;
        System.out.println("num2 = " + num2);

        //Va a "sumar" todas las cadenas una despues de la otra
        // se imprimen todas juntas al final
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Paco ' ";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
