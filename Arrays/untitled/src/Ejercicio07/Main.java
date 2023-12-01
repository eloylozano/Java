package Ejercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Clase escaner
        Scanner teclado = new Scanner(System.in);

        // Define la longitud del array
        System.out.print("Intrdouce la longitud del array: ");
        int longitud = teclado.nextInt();

        // Array longitud = 10
        int[] array = new int[longitud];

        System.out.println("Se introducirán " + longitud + " valores");

        // Se recorre el array introduciendo los valores en cada posición
        for (int i = 0; i < array.length; i++) {
            System.out.print(" · Valor " + (i + 1) + ": ");
            int valor = teclado.nextInt();
            array[i] = valor;
        }

        // Mostrar el array
        System.out.print("\nEl contenido del array es: \n");

        // Igualamos la posición a 10 (largo del array), y se resta 1 hasta que sea 0
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
