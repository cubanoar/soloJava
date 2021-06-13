package com.cubanoar.mistring;

public class StringConcatenacion {
    public static void main(String[] args) {
        String str1 = "Cliente";
        String str2 = "Periquito Peres";

        //Concatenamos con <+>
        String str3 = str1 + " le compra a  " + str2;
        System.out.println(str3);

        int num1 = 10;
        int num2 = 5;

        //Concatenamos el String con la suma de num1 y num2 con () para que la realice correctamente
        System.out.println(str3 + (num1 + num2));


        /*Por estar el int delante suma correctamente y concatena el String*/
        System.out.println(num1 + num2 + str3);

        /*Usamos el <.concat()>*/
        String str4 = str1.concat(" con ").concat(str2);
        System.out.println("str4 = " + str4);
    }
}
