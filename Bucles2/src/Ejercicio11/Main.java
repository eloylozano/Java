package Ejercicio11;

import java.util.Scanner;

public class Main {

    // Función para calcular el MCD usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {

        // Si b == 0 devolver A
        if (b == 0) {
            return a;
        }
        // Entonces devolvemos calcullarMCD
        return calcularMCD(b, a % b);
    }

    //------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba dos números para calcular el MCD");

        // Creamos la entrada para el num 1
        System.out.print(" · Número 1: ");
        int num1 = teclado.nextInt();

        // Creamos la entrada para el num 2
        System.out.print(" · Número 2: ");
        int num2 = teclado.nextInt();
        teclado.close();

        //Lo calcularemos con la siguiente fórmula
        //     MCM(a, b) = (a * b) / MCD(a, b)

        // Variable para calcular el MCD
        int mcd = calcularMCD(num1, num2);
        // Variable para calcular el MCM en base al MCD
        int mcm = (num1 * num2) / mcd;

        // Imprimir el resultado
        System.out.println("\nEl MCM de " + num1 + " y " + num2 + " es: " + mcm);
    }
}
