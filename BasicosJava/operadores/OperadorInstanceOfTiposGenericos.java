package com.cubanoar.operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object unString = "Creamos un String ... creado!";

        Number num1 = Integer.valueOf(7); // 7;

        Boolean bool1 = unString instanceof String;

        System.out.println("unString es del tipo String = " + bool1);

        bool1 = unString instanceof Object;
        System.out.println("unString es del tipo Object = " + bool1);

        bool1 = unString instanceof Integer;
        System.out.println("unString es del tipo Integer = " + bool1);

        bool1 = num1 instanceof Integer;
        System.out.println("num1 es del tipo Integer = " + bool1);

        bool1 = num1 instanceof Number;
        System.out.println("num1 es del tipo Number = " + bool1);

        bool1 = num1 instanceof Object;
        System.out.println("num1 es del tipo Object = " + bool1);

        bool1 = num1 instanceof Long;
        System.out.println("num1 es del tipo Long = " + bool1);

        bool1 = num1 instanceof Double;
        System.out.println("num1 es del tipo Double = " + bool1);

        Number decimal = Float.valueOf(45.54f);
        bool1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + bool1);

        bool1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + bool1);

        bool1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + bool1);

        bool1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + bool1);

        bool1 = bool1 instanceof Boolean;
        System.out.println("bool1 es del tipo Boolean = " + bool1);
    }
}
