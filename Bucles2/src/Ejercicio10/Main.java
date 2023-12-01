package Ejercicio10;

import java.util.Scanner;

public class Main {
    // Función para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {

        // Mientras que b no sea 0
        while (b != 0) {

            // Se define la variable temp
            int temp = b;
            // b es igual al resto de A/B
            b = a % b;
            // Igualamos a variable temporal
            a = temp;
        }
        return a;
    }

    //--------------------------------------------------------------------------------------------------
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

        // Variable para calcular el MCD
        int mcd = calcularMCD(num1, num2);

        // Imprimir el resultado
        System.out.println("\n3frEl MCD de " + num1 + " y " + num2 + " es: " + mcd);
    }


}
