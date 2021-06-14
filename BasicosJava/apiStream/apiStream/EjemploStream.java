package apiStream;

import java.util.ArrayList;
import java.util.List;

public class EjemploStream {
    public static void main(String[] args) {

        /*4 formas de crearlos*/
        /*1*///Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")/*Arreglo*/;
        //El forEch es un operador final
        //nombres.forEach(System.out::println);

        /*2*///String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        //Stream<String> nombres1 = Arrays.stream(arr);
        // nombres1.forEach(System.out::println);

        /*3*//*Stream<String> nombres2 = Stream.<String>builder()
                .add("Pato")
                .add("paco")
                .add("pepa")
                .add("pepe")
                .build();
        nombres2.forEach(System.out::println);*/


        /*4*/
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pepa");

        //Stream<String> nombres = lista.stream();
        //nombres.forEach(System.out::println);

        lista.stream().forEach(System.out::println);


    }
}
