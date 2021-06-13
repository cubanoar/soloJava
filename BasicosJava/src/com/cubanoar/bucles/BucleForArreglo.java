package com.cubanoar.bucles;

import javax.swing.*;

public class BucleForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Ely", "Viti", "Day", "Mona", "Wally", "Martha", "Pablo", "Lola"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().contains("ELY".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("loLa".toLowerCase())){
                continue;
            }
            System.out.println( i + ".- " + nombres[i]);
        }
        
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Viti\" o \"Day\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " encontrado!!!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }
}
