package apiStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                /*No repite, deja uno solo, los demas no se muestran*/
                .distinct();

        //nombres.forEach(System.out::println);


        /*Si queremos podemos convertir a una lista con collect*/
        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        System.out.println("Resultado 1 de la lista => " + lista.get(1));


    }
}
