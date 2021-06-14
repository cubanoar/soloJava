package apiStream;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                /*Podemos encontrar elementos en una lista con esta combinacion de <.filter> y despues el <.findFirst>*/
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();/*Operador Terminal, Retorna el primer PePe, retorna un Optional*/
        // System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre());Si lo encuentra bien sino valor por defecto
        // System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")).getNombre());
        if (usuario.isPresent()) {
            System.out.println(usuario.get().getNombre());
        } else {
            System.out.println("No se encontró el objeto!");
        }
        //nombres.forEach(System.out::println);

    }
}
