package com.cubanoar.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {
        /*Sigue la misma mecanica que el LocalDate */
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Seg.: " + ahora.getSecond());
        
        LocalTime seisConTreinta = LocalTime.of(6, 30, 59);
        System.out.println(seisConTreinta);
        seisConTreinta = LocalTime.parse("18:30:45");

        System.out.println("seisConTreinta = " + seisConTreinta);
        LocalTime sieteConTreinta = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println("sieteConTreinta = " + sieteConTreinta);
        boolean esAnterior = LocalTime.of(6, 30, 59).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);

        /*Dar dar formato a la hora, existen 2 formas*/
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");/* Cuando la hora es hh es am y pm,
                              en HH es 24 horas, la <a> del final es para colocar am o pm segun corresponda */
        /*1*/
        String ahoraFormateado = seisConTreinta.format(df);
        System.out.println(ahoraFormateado);
        /*2*/
        ahoraFormateado = df.format(ahora);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
        
        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
