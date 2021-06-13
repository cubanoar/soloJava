package com.cubanoar.bucles;

public class BucleForEach {
    public static void main(String[] args) {
        
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num: numeros){
            System.out.println("Numeros = " + num);
        }

        String[] nombres = {"Ely", "Viti", "Day", "Mona", "Wally", "Martha", "Pablo", "Lola"};
        
        for(String nombre : nombres){
            System.out.println("Nombre = " + nombre);
        }
    }
}
