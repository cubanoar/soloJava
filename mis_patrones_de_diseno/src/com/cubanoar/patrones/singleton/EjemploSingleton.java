package com.cubanoar.patrones.singleton;

public class EjemploSingleton {
    private static EjemploSingleton instancia = null;

    private EjemploSingleton(){}

    public static EjemploSingleton getInstancia(){
        if (instancia == null)
            instancia = new EjemploSingleton();
        return instancia;
    }



}
