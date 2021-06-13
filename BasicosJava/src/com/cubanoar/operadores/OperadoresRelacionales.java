package com.cubanoar.operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        
        int num1 = 3;
        byte num2 = 7;
        float num3 = 127e-7f;
        double num4 = 2.1413e3;
        boolean num5 = false;

        //Comparamos
        boolean b1 = num1 == num2;
        System.out.println("b1 = " + b1);
        //Si b1 diferente de true
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);
        //Si num1 diferente de num2
        boolean b3 = num1 != num2; // <>
        System.out.println("b3 = " + b3);
        //Si num5 igual true
        boolean b4 = num5 == true;
        System.out.println("b4 = " + b4);
        //Si num5 diferente de true
        boolean b5 = num5 != true;
        System.out.println("b5 = " + b5);
        //Si num1 MAYOR que num2
        boolean b6 = num1 > num2;
        System.out.println("b6 = " + b6);
        //Si num2 MENOR que num1
        boolean b7 = num2 < num1;
        System.out.println("b7 = " + b7);
        //SI num4 MAYOR o IGUAL que num3
        boolean b8 = (num4 >= num3);
        System.out.println("b8 = " + b8);
        //Si num4 MENOR o IGUAL que num3
        boolean b9 = num4 <= num3;
        System.out.println("b9 = " + b9);
        
    }
}
