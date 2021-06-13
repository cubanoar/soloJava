package com.cubanoar.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        for(String pez: peces){
            /*Usamos el add con2 propositos, aprovechamos el retorno boolean para comparar con el if
            * y si es verdadero agrega el Set*/
            if(!unicos.add(pez)){
                System.out.println("Elemento Duplicado: " + pez);
            }
        }
        System.out.println(unicos.size() + " elementos no duplicados: " + unicos);
    }
}
