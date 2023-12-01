package Ejercicio03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(5);
            System.out.print(array[i] + " ");
        }

        addAt(array);
    }

    private static void addAt(int[] array) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nEscribe un valor para introducir en el array: ");
        int valor = teclado.nextInt();

        boolean insertado = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = valor;
                System.out.println("Se ha introducido el " + valor + " en la posición " + i);
                insertado = true;
                break;
            }
        }

        if (!insertado) {
            System.out.println("No hay espacio disponible en el array para insertar el valor.");
        }

        System.out.print("El array después de la inserción: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
