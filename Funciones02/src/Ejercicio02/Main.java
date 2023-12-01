package Ejercicio02;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] array = new int[10];
        int maximoValor = Integer.MIN_VALUE;  // Inicializar con el valor mínimo posible

        System.out.println("Valores generados:");

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(10) + 1;
            System.out.print(array[i] + " ");

            if (array[i] > maximoValor) {
                maximoValor = array[i];
            }
        }

        System.out.println("\nEl máximo valor en el array es: " + maximoValor);
    }
}
