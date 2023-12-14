package Ejemplo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(5) +1 ;
            System.out.print(array[i] + " ");
        }

        System.out.print("\nIntroduce un número del 1-5 para buscar en el array: ");
        int valorBuscar = teclado.nextInt();
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorBuscar) {
                contador++;
            }
        }

        System.out.println("Se ha encontrado el número " + valorBuscar + ", " + contador + " veces");
    }
}
