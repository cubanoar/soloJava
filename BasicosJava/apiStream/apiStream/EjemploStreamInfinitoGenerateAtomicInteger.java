package apiStream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerateAtomicInteger {
    public static void main(String[] args) {
        //Genera un stream infinito si no le ponemos el .limit
        Stream.generate(() -> "Hi, everybody!!!").limit(5L).forEach(System.out::println);

        /*Importante este AtomicInteger, tiene varios metodos interesantes*/
        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return contador.incrementAndGet();
        })
                .limit(7)
                .forEach(System.out::println);
    }
}
