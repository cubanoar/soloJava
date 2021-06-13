package com.cubanoar.mistring;

public class StringInmutable {
    public static void main(String[] args) {
        String cliente = "Pancholo Peres";
        String vendedor = "Paco Alvarado";

        //Concatenamos los 2 String con <.concat()>
        String str1 = cliente.concat(" ").concat(vendedor);
        System.out.println("cliente = " + cliente);
        System.out.println("str1 = " + str1);
        //Se compara por referencia
        System.out.println(cliente == str1);

        //Creamos un nuevo String con <.transform> que transforma :) la cadena cliente, la original queda igual
        String str2 = cliente.transform(c -> {
            return c + " con " + vendedor;
        });
        
        System.out.println("cliente = " + cliente);
        System.out.println("str2 = " + str2);

        //Cambia las <a> por <A>
        String str3 = str1.replace("a", "A");

        System.out.println("str1 = " + str1);
        System.out.println("str3 = " + str3);
    }
}
