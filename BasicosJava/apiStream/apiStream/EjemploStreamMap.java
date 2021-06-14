package apiStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        //Un solo operador terminal
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                /*el map es un operador intermedio, devuelve un dato, una nueva instancia
                 * el metodo split separa un patron y retorna un arreglo*/
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                /*OPerador intermedio, se usa para mirar, inspeccionar los datos del flujo*/
                .peek(System.out::println)/*Solo revisa los elementos*/
                .peek/*map*/(usuario -> {
            String nombre = usuario.getNombre().toUpperCase();
            usuario.setNombre(nombre);
        });

        /*Convertimos el Stream en un tipo List, el operador collect es terminal igual que el forEach*/
        List<Usuario> lista = nombres.collect(Collectors.toList());
        /*Recorremos la lista con el forEach*/
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);

    }
}
