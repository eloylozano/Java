package Ejercicio18;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(20) + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println("\nSe ha creado un array de longitud 15");

        System.out.print("\nIntroduce un valor para buscarlo: ");
        int valor = teclado.nextInt();

        int posicion = buscarValor(array, valor);

        if (posicion != -1) {
            System.out.println("El valor " + valor + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El valor " + valor + " no se encuentra en el array.");
        }
    }

    private static int buscarValor(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;  // Devolver la posición si se encuentra el valor
            }
        }
        return -1;  // Devolver -1 si no se encuentra el valor en el array
    }
}
