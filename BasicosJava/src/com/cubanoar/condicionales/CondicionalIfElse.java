package com.cubanoar.condicionales;

public class CondicionalIfElse {
    public static void main(String[] args) {

        float promediando = 5.5f;

        if(promediando >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio!");
        } else if(promediando >= 6.0){
            System.out.println("Muy buen promedio!");
        } else if(promediando >= 5.5){
            System.out.println("Buen promedio!");
        } else if(promediando >= 5.0){
            System.out.println("Regular, necesitas esforzarte un poco más!");
        } else if(promediando >= 4.0){
            System.out.println("Insuficiente, necesitas estudiar más!");
        } else {
            System.out.println("Reprobado!");
        }

        System.out.println("tu promedio es " + promediando);
    }
}
