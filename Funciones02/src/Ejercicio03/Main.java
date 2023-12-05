package Ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números enteros para calcular los intermedios: ");
        System.out.print(" · Valor 1: ");
        int valor1 = teclado.nextInt();
        System.out.print(" · Valor 2: ");
        int valor2 = teclado.nextInt();

        valoresIntermedios(valor1, valor2);
    }

    private static void valoresIntermedios(int valor1, int valor2) {
        System.out.println("Los valores entre " + valor1 + " y " + valor2 + " son:");
        for (int i = valor1 + 1 ; i < valor2; i++) {
            System.out.print(i + " ");
        }
    }
}
