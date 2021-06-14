import java.io.*;
import java.util.Scanner;

public class ManejoArchivos {

    public void crearArchivo(String nombre){
        /*Cada vez que trabajamos con archivos usamos la clase File
        * que representa al archivo y luego se lo pasamos por constructor
        * a FileWriter que se encarga de crearlo*/
        File archivo = new File(nombre);

        /*El true al final del constructor, nos permite añadir contenido, si el archivo no existe lo crea*/
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){
            /*Escribimos en el archivo*/
            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo acá escribiendo un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            /*Es importante cerrar el recurso, en este caso al estar dentro de los parentesis del try el
            * recurso, no es necesario, ya que por detras de escena es invocado el .close*/
            //buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        /*Otra manera parecido al BufferWriter*/
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){

            buffer.println("Escribimos cualquier cosa!");
            buffer.println("Sigo escribiendo...");
            buffer.printf("Hasta luego %s!", "Lucas");
            // buffer.close();
            System.out.println("Archivo creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        /*Creamos la instancia de File*/
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            while ( (linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre/*Ruta de archivo*/);
        /*Colocamos el File(archivo) en el constructor del Scanner donde antes estaba System.in*/
        try (Scanner s = new Scanner(archivo)){

            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
