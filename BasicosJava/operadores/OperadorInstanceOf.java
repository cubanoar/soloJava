package com.cubanoar.operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String unString = "Creamos un String ...creado!";

        Integer num1 = 7;

        Boolean bool1 = unString instanceof String;

        System.out.println("unString es del tipo String = " + bool1);

        bool1 = unString instanceof Object;
        System.out.println("unString es del tipo Object = " + bool1);

        bool1 = num1 instanceof Integer;
        System.out.println("num1 es del tipo Integer = " + bool1);

        bool1 = num1 instanceof Number;
        System.out.println("num1 es del tipo Number = " + bool1);

        bool1 = num1 instanceof Object;
        System.out.println("num1 es del tipo Object = " + bool1);

        Double decimal = 45.54;
        bool1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + bool1);

        bool1 = bool1 instanceof Boolean;
        System.out.println("bool1 es del tipo Boolean = " + bool1);
    }
}
