package com.cubanoar.pasereferenciavalor;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] numeros = {10, 11, 12};

        System.out.println("Iniciando ...");
        //Recorre el arreglo numeros y lo imprime en pantalla
        for(int i = 0; i < numeros.length; i++){
            System.out.println("numeros[i] = " + numeros[i]);
        }

        System.out.println("Antes de llamar al método prueba");
        prueba(numeros);
        System.out.println("Después de llamar al método prueba");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("numeros[i] = " + numeros[i]);
        }

        System.out.println("Finalizando con los datos del arreglo modificados!");
    }

    public static void prueba(int[] arrNumeros){
        System.out.println("Iniciando método prueba");
        for(int i = 0; i < arrNumeros.length; i++){
            //Va a sumar 20 a cada posicion del arreglo(A cada valor)
            arrNumeros[i] = arrNumeros[i] + 20;
        }
        System.out.println("Finalizando método prueba");
    }
}

