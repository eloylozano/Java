package Ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un valor baliza: ");
        int baliza = teclado.nextInt();
        System.out.print("Introduce la cantidad de valores a introducir: ");
        int longitud = teclado.nextInt();
        int[] valores = new int[longitud];

        System.out.println("Introduce los valores que se piden: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(" · Valor " + (i + 1) + " : ");
            valores[i] = teclado.nextInt();
        }

        int contadorMayores = 0;
        int contadorMenores = 0;
        int sumaMayores = 0;

        // Iterar sobre los valores y contar mayores y menores
        for (int valor : valores) {
            if (valor > baliza) {
                contadorMayores++;
                sumaMayores += valor;
            } else if (valor < baliza) {
                contadorMenores++;
            }
        }

        System.out.println("Números mayores a la baliza: " + contadorMayores);
        System.out.println("Números menores a la baliza: " + contadorMenores);
        System.out.println("Suma de los mayores: " + sumaMayores);
    }
}
