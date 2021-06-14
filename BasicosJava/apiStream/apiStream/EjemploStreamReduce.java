package apiStream;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();
        /*operado terminal .reduce( valor con el cual comienza <a>, <a>,<b>)*/
        String resultado = nombres.reduce("resultado concatenación ", (a, b) -> a + " # " + b);
        System.out.println(resultado);


    }
}
