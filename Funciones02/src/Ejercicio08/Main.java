package Ejercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular MCD de dos números:");
        System.out.print(" · Número 1: ");
        int numero1 = teclado.nextInt();
        System.out.print(" · Número 2: ");
        int numero2 = teclado.nextInt();

        int mcd = calcularMCD(numero1, numero2);
        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);
    }

    private static int calcularMCD(int a, int b) {
        // Aplicar el algoritmo de Euclides
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}