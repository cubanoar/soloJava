package com.cubanoar.primitivos;

public class PrimitivosBoolean {
    public static void main(String[] args) {
        
        boolean valorLogico = true;
        System.out.println("valorLogico = " + valorLogico);
        
        double dob = 98765.43e-3; // 98.76543
        System.out.println("dob = " + dob);
        
        float flo = 1.2345e2f; // 123.45
        System.out.println("flo = " + flo);
        
        valorLogico = dob < flo;
        System.out.println("valorLogico = " + valorLogico);
        
        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
