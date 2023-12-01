package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarar un array de 10 elementos.
        int[] array = new int[10];

        // Introducir los elementos en el array.
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el elemento " + i + ": ");
            array[i] = teclado.nextInt();
        }

        // Mostrar el array.
        System.out.println("Contenido del array:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + i + ": " + array[i]);
        }

        teclado.close();
    }
}
