package com.cubanoar.pasereferenciavalor;

public class PasarPorValor {
    public static void main(String[] args) {

        int num1 = 10;

        System.out.println("Iniciamos el método main con num1 = " + num1);
        test(num1);
        System.out.println("Finaliza el método main con el valor de num1 (se mantiene igual) = " + num1);

        num1 = 22;
        System.out.println("Ahora si se modifica = " + num1);

    }

    public static void test(int numero){
        System.out.println("Iniciamos el método test con numero = " + numero);
        numero = 35;
        System.out.println("Finaliza el método test con numero = " + numero);
    }
}
