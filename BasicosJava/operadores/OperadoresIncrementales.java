package com.cubanoar.operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        int num1 = 1;
        int num2 = ++num1; // num1 = num1 + 1

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        // Post incremento
        num1 = 2;
        System.out.println("Inicial de num1 = " + num1);
        num2 = num1++;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Pre decremento
        num1 = 3;
        num2 = --num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Post decremento
        num1 = 4;
        num2 = num1--;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("num2 = " + (++num2));
        System.out.println("num2 = " + (num2++));
        System.out.println("num2 = " + num2);
    }
}
