package com.cubanoar.patrones.singleton;

public class MetodoMain {
    public static void main(String[] args) {

        EjemploSingleton a = EjemploSingleton.getInstancia();
        EjemploSingleton b = EjemploSingleton.getInstancia();
        EjemploSingleton c = EjemploSingleton.getInstancia();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
