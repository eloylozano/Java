package Ejercicio20;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Intoduce tus números para la lotería (1-32): ");
        int[] apuesta = new int[6];
        for (int i = 0; i < apuesta.length; i++) {
            System.out.print(" · Número " + (i + 1) + " : ");

                apuesta[i] = teclado.nextInt();
            if (apuesta[i] > 32 || apuesta[i] < 1){
                i--;
                System.out.println("Debe estar entre 1 y 32");
            }

        }

        int[] resultado = new int[6];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = aleatorio.nextInt(32) + 1;
            System.out.print(resultado[i] + " ");
        }

        int comprobados = 0;

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < apuesta.length; j++) {
                if (resultado[i] == apuesta[j]) {
                    comprobados++;
                }
            }
        }

        System.out.println("\nHa acertado un total de " + comprobados + " aciertos");
    }
}
