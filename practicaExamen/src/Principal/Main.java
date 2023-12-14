package Principal;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nMENU:");
            System.out.println(" 1. Bucle");
            System.out.println(" 2. Arrays");
            System.out.println(" 3. Otra cosa");
            System.out.println(" 0. Salir");

            System.out.print("Escoge una opción: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("\nEscribre el número de veces que se repita el * en pirámide: ");
                    int numeroRepeticiones = teclado.nextInt();

                    for (int i = 1; i <= numeroRepeticiones; i++) {
                        System.out.println();
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    Random aleatorio = new Random();
                    int[] arrayNumeros = new int[10];
                    for (int i = 0; i < arrayNumeros.length; i++) {
                        arrayNumeros[i] = aleatorio.nextInt(5) + 1;
                        System.out.print(arrayNumeros[i] + " ");
                    }
                    System.out.print("\nEscribe el número que quieres buscar en el array: ");
                    int buscador = teclado.nextInt();
                    int contador = 0;
                    for (int i = 0; i < arrayNumeros.length; i++) {
                        if (arrayNumeros[i] == buscador){
                            contador++;
                        }
                    }

                    System.out.println("El número " + buscador + " se ha encontrado " + contador + " veces");
                    break;
                case 3:
                    for (int i = 20; i >= 0; i--) {
                        if (i % 3 != 0){
                            System.out.println(i);
                        }
                    }
                    break;
                default:
                    System.out.println("Escribre una opción válida!");
            }

        } while (true);
    }
}
