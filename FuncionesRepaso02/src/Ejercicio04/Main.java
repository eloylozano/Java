package Ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una palabra para comprobarla: ");
        String palabra = teclado.nextLine().toLowerCase();

        char[] arrayPalabra = palabra.toCharArray();

        char[] palabraInversa = new char[arrayPalabra.length];  // Crear un nuevo array para la palabra inversa

        for (int i = arrayPalabra.length - 1, j = 0; i >= 0; i--, j++) {
            palabraInversa[j] = arrayPalabra[i];
        }

        // Convertir ambos arrays a cadenas y compararlas
        if (new String(palabraInversa).equals(new String(arrayPalabra))) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}

