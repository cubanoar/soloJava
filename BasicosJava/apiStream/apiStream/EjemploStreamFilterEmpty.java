package apiStream;

import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "", "Pepe Mena",
                        "")
                /*Filtramos por los que estan vacios con .isEmpty*/
                .filter(s -> s.isEmpty())
                //.peek(System.out::println)
                /*Vemos cuantos son*/
                .count();
        System.out.println("count = " + count);


    }
}
