import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }

        System.out.println("\r\nIngrese un número a buscar:");
        int num = s.nextInt();
        int i = 0;
        for(; i < a.length && a[i] != num; i++){}

        if(i == a.length){
            System.out.println("Número no encontrado");
        } else if(a[i] == num){
            System.out.println("Encontrado en la posición: " + i);
        }


        int[] n = new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
      
    }
}
