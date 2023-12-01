package Ejercicio02;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Entrada para el random
        Random valores = new Random();

        // Se declara el array
        int[] arrayValores = new int[30];

        System.out.println("Se generan 30 valores y calculamos la moda");

        // Se recorre el array imprimiendo los valores
        for (int i = 0; i < arrayValores.length; i++) {
            arrayValores[i] = valores.nextInt(10) + 1;
            System.out.print(arrayValores[i] + " ");
        }

        // Calculamos la moda
        int moda = calcularModa(arrayValores);

        System.out.println("\nLa moda del array es: " + moda);
    }

    public static int calcularModa(int[] array) {
        // Suponemos valores entre 1 y 10
        int[] frecuencias = new int[11];

        // Recorremos el array y contamos las frecuencias
        for (int elemento : array) {
            frecuencias[elemento]++;
        }

        // Encontramos la moda
        int moda = -1;
        int maxFrecuencia = 0;

        for (int i = 1; i < frecuencias.length; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                moda = i;
                maxFrecuencia = frecuencias[i];
            }
        }

        return moda;
    }
}
