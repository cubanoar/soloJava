package apiStream;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new apiStream.Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                /*Retorna un long con la cantidad de elementos*/
                .count();

        System.out.println(count);
    }
}
