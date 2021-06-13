package com.cubanoar.condicionales;

import java.util.Scanner;

public class CondicionalIfElseNumDiasMes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número del mes de 1 - 12");
        int mes = sc.nextInt();

        int dias = 0;
        System.out.println("Ingrese el año (YYYY)");
        int anio = sc.nextInt();

        if(mes == 1 || mes ==3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            dias = 31;
        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            dias = 30;
        } else if(mes == 2){
            if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))){
                dias = 29;
            } else {
                dias = 28;
            }
        }
        System.out.println("dias = " + dias);
    }
}
