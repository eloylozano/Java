package Ejercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        visualizarPalabrasConLongitud(frase.toCharArray());
    }

    private static void visualizarPalabrasConLongitud(char[] frase) {
        StringBuilder palabra = new StringBuilder();
        for (char caracter : frase) {
            if (caracter != ' ') {
                palabra.append(caracter);
            } else {
                if (palabra.length() > 0) {
                    System.out.println(palabra + " " + palabra.length());
                    palabra.setLength(0);  // Reiniciar la palabra
                }
            }
        }

        // Tratar la última palabra si la frase no termina con espacio
        if (palabra.length() > 0) {
            System.out.println(palabra + " " + palabra.length());
        }
    }
}
