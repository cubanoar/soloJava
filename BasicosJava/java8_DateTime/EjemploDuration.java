package com.cubanoar.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {
    public static void main(String[] args) {

        /*Periodos se refiere a tiempo*/
        LocalDateTime fecha1 = LocalDateTime.now();
        // fecha1 = fecha1.withMonth(10);
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);

        /*Nos devuelve el tiempo transcurrido entre fecha 1 y fecha 2*/
        Duration lapsus = Duration.between(fecha1, fecha2);

        System.out.println("lapsus = " + lapsus);
        /*Con el operador . podemos extraer minutos, segundos, horas, los dias(nos devuleve un entero aunque sean 27 horas)*/
        System.out.println(lapsus.toMinutes());
        System.out.println("sumamos 5 horas " + lapsus.plusHours(5));
    }
}
