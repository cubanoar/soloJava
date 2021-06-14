package apiStream;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream<Integer> nombres = Stream.of(5, 10, 15, 20);
        /*operado terminal .reduce( valor con el cual comienza <a>, <a>,<b>)*/
        int resultado = nombres.reduce(0, (a, b) -> Integer.sum(a, b));
        System.out.println(resultado);


    }
}
