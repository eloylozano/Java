package Ejercicio02;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }

        funcionAt(array);
    }

    private static void funcionAt(int[] array) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce un valor para buscar en el array: ");
        int valorIntroducido = teclado.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < array.length; i++) {
            if (valorIntroducido == array[i]) {
                System.out.println("\nSe encontró en la posición: " + (i + 1 ));
                encontrado = true;
                break;  // Salir del bucle cuando se encuentre el valor
            }
        }

        if (!encontrado) {
            System.out.println("\nNo está en el array ese número, posición -1");
        }
    }
}
