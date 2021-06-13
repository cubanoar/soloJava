package com.cubanoar.operadores;

public class OperadoresLogico {
    public static void main(String[] args) {
        
        int num1 = 3;
        byte num2 = 3;
        float num3 = 127e-7f;
        double num4 = 2.1413e3;
        boolean num5 = false;

        /*Primero evaluamos == < y luego && */
        boolean bool1 = num1 == num2 && num3 < num4 && num5 == false;
        System.out.println("bool1 = " + bool1);
        /*Primero evaluamos == < y luego || */
        boolean bool2 = num1 == num2 || num3 < num4;
        System.out.println("bool2 = " + bool2);
        /*Primero evaluamos (< == y luego ||) == y luego && */
        boolean bool3 = num1 == num2 && (num3 < num4 || num5 == true);
        System.out.println("bool3 = " + bool3);
        /*Primero evaluamos (== < y luego ||) == y luego && */
        boolean bool4 = (num1 == num2 || num3 < num4) && num5 == true;
        System.out.println("bool4 = " + bool4);
        /*Primero evaluamos (||) == y luego && */
        boolean bool5 = (true || true) && false;
        System.out.println("bool5 = " + bool5);
        /*Primero evaluamos && ||*/
        boolean bool6 = true || false && false || false; // true
        System.out.println("bool6 = " + bool6);
        /*Primero evaluamos ((||)&&) y luego ||*/
        boolean bool7 = ((true || false) && false) || false; // false
        System.out.println("bool7 = " + bool7);
        

    }
}
