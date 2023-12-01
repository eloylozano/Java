package Ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Imprimos un menú
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio 8");
        System.out.println(" 1. Números pares del 1 al 10");
        System.out.println(" 2. Números impares del 1 al 10");
        System.out.println(" 0. Salir");
        System.out.print("\nEscoja una opción: ");
        // Definimos la variable de la entrada
        int opcion = teclado.nextInt();
        teclado.close();

        // Para escoger en cada caso
        switch (opcion) {

            // Opción 0 salir
            case 0:
                System.exit(0);
                break;
            // Opción 1 pares
            case 1:
                for (int p = 0; p <= 10; p += 2) {
                    System.out.println(p);
                }
                break;
            // Opción 2 impares
            case 2:
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println(i);
                }
                break;
            // Otra opción no será válida
            default:
                System.out.println("Opción no válida");
        }
    }
}
