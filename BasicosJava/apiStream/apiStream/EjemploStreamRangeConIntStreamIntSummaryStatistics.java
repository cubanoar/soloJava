package apiStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class EjemploStreamRangeConIntStreamIntSummaryStatistics {
    public static void main(String[] args) {

        /*Operador .range disponible para IntStream*/
        IntStream num = IntStream.range(5, 20).peek(System.out::println);

        // int resultado = num.reduce(0, Integer::sum);
        /*OPerador sum disponible para IntStream*/
        // int resultado = num.sum();
        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("sum: " + stats.getSum());
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());


    }
}
