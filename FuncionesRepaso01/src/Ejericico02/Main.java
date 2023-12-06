package Ejericico02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arrayPrincipal = new int[15];

        System.out.print("Introduce un valor para guardarlo al final del array: ");
        int valor = teclado.nextInt();

        arrayPrincipal[arrayPrincipal.length - 1] = valor;

        for (int i = 0; i < arrayPrincipal.length; i++) {
            System.out.print(arrayPrincipal[i] + " ");
        }
    }
}