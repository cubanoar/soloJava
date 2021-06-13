package com.cubanoar.condicionales;

import java.util.Scanner;

public class CondicionalSwitchCaseNumDiasMes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número del mes de 1 - 12");
        int mes = sc.nextInt();

        int dias = 0;
        System.out.println("Ingrese el año (YYYY)");
        int anio = sc.nextInt();

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))){
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                dias = 0;
        }

        System.out.println("Dias = " + dias);
    }
}
