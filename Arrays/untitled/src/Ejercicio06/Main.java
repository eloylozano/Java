package Ejercicio06;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Clase para las entradas
        Scanner teclado = new Scanner(System.in);

        // Clase para el random
        Random numero = new Random();

        // Declarar array de longitud 10 valores enteros
        int[] array = new int[10];

        // Recorremos el array asignando un número random a cada posición y se imprime
        for (int i = 0; i < array.length; i++) {
            int answer = numero.nextInt(10);
            array[i] = answer;
            System.out.println(" · Objeto " + i + " = " + answer);
        }

        // Creamos la entrada para pedir el número
        System.out.print("\nIntroduce un número para buscarlo en el array: ");
        int findNumber = teclado.nextInt();

        // Creamos la variable para el contador
        int contador = 0;

        // Recorremos el array buscando el número y sumando el contador
        for (int i = 0; i < array.length; i++) {
            if (findNumber == array[i]) {
                contador++;
            }
        }

        // Si el contador está a 0 imprime mensaje sino muestra el resultado
        if (contador == 0){
            System.out.println("No se ha encontrado el número");
        } else {
            System.out.println("Se ha encontrado " + contador + " veces");
        }
    }
}
