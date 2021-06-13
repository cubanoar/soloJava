package com.cubanoar;

import com.cubanoar.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        /*Nos permite pasar por argumento un solo parametro
        * no devuelve nada, es void*/
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        /*Lo mismo que el anterior pero recibe 2 argumentos*/
        //Si son 2 los argumntos estamos obligados a colocar parentesis
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años!");

        consumidorBi.accept("pepe", 20);

        Consumer<String> consumidor2 = System.out::println;// mensaje -> Siystem.out.println(mensaje)
        consumidor2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("andres", "pepe", "luz", "paco");
        nombres.forEach(consumidor2);

        //No recibe argumentos pero devuelve un valor, que puede ser cualquiera Integer etc
        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();

        BiConsumer<Usuario, String> asignarNombre =  Usuario::setNombre;/*(persona,nombre) -> {
            persona.setNombre(nombre);
        };*/
        asignarNombre.accept(usuario, "Andrés");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";

        System.out.println(proveedor.get());
    }
}
