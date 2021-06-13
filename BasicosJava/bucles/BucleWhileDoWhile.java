package com.cubanoar.bucles;

public class BucleWhileDoWhile {
    public static void main(String[] args) {

        int num1 = 0;
        while(num1 <= 5){
            System.out.println("num1 = " + num1);
            num1++;
        }

        num1 = 0;
        boolean valorLogico = true;

        while(valorLogico){

            if(num1 == 7){
                valorLogico = false;
            }
            System.out.println("num1 = " + num1);
            num1++;
        }

        /*DoWhile*/
        valorLogico = false;
        do {
            System.out.println("se ejecuta al menos una vez");
        } while (valorLogico);

        valorLogico = true;
        num1=0;

        do {
            if(num1 == 10){
                valorLogico = false;
            }
            System.out.println("num1 = " + num1);
            num1++;
        } while (valorLogico);
    }
}
