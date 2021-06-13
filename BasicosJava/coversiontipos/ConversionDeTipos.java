package com.cubanoar.coversiontipos;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("Valor como entero = " + numeroInt);
        
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("Valor como double = " + realDouble);
        
        String logicoStr = "TruE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("Valor como boolean = " + logicoBoolean);
        
        int otroNumeroInt = 100;

        System.out.println("Valor Int = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("Valor como String = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("Valor como String = " + otroNumeroStr);
        
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("Valor como double = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("Valor como String = " + otroRealStr);
        
        int i = 22768;
        //De int a short
        short s = (short) i;
        System.out.println("short = " + s);
        //De int a long
        long l = i;
        System.out.println("long = " + l);
        //Maximo valor de un short, asi podemos con Integer, Double, ...
        System.out.println("Maximo valor de un short => " + Short.MAX_VALUE);
        System.out.println("Maximo valor de un double => " + Double.MAX_VALUE);

        char b = (char) i;
        System.out.println("char = " + b);

        float f = (float) i;
        System.out.println("float = " + f);
    }
}
