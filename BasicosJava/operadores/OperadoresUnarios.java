package com.cubanoar.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int num1 = -5;
        
        int num2 = +num1; // num2 = (1)*num1 => -5
        System.out.println("num2 = " + num2);
        
        int num3 = -num1; // num3 = (-1)*num1 => 5
        System.out.println("num3 = " + num3);

        num1 = 6;
        num2 = +num1;
        System.out.println("num2 = " + num2);
        
        num3 = -num1;
        System.out.println("num3 = " + num3);
    }
}
