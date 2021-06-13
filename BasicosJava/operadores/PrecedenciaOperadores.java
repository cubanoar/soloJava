package com.cubanoar.operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int num1 = 14;
        int num2 = 8;
        int num3 = 20;

        double promediando = (num1 + num2 + num3) / 3d;
        System.out.println("Promediando = " + promediando);

        promediando = (num1 + num2 + num3) / 3d * 10; // 14 + 8 + 0.6
        System.out.println("Promediando = " + promediando);

        promediando = --num1 + num2++ + num3 / 3d * 10; // (13 + 8) + 66.6
        System.out.println("Promediando = " + promediando);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
