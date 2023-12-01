package Ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarar un array de 10 elementos
        int[] array = new int[10];

        // Introducir elementos en el array
        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = teclado.nextInt();
        }

        // Mostrar el array
        System.out.println("\nEl contenido del array es:");

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
