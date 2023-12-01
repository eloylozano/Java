package Ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();
        System.out.print("Introduce la potencia: ");
        int exponente = teclado.nextInt();

        int resultado = calcularPotencia(base, exponente);

        System.out.println("El resultado es: " + resultado);
    }

    private static int calcularPotencia(double base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
