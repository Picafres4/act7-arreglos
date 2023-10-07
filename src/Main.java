import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nuevoArray = new int[20]; // declaración de array
        Scanner teclado = new Scanner(System.in); // declaración de objeto scanner

        System.out.println("Ingresa 20 elementos para llenar el arreglo"); // mensaje de inicio

        // ciclo para iteración del arreglo
        for (int i = 0; i < nuevoArray.length; i++){
            System.out.println("Ingresa el elemento" + (i + 1) +": " ); // mensaje que indica en qué índice del arreglo va
            nuevoArray[i] = teclado.nextInt(); // entrada de teclado.
        }

        // ciclo para imprimir resultados
        for (int i = 0; i < nuevoArray.length; i++) { // imprimirá por el tamaño del arreglo

            int cuadrado =  (int) Math.pow(nuevoArray[i], 2); // fórmula para el cuadrado
            int cubo = (int) Math.pow(nuevoArray[i], 3); // fórmula para el cubo

            // impresión final
            System.out.println("El elemento " + (i + 1) + " es " + (nuevoArray[i] + ",su cuadrado es " +
                    (cuadrado) + " y su tercera potencia es " + (cubo)));
        }

    }
}