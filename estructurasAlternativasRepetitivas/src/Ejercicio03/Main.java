package Ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Se realizará una división con los dos valores introducidos (Deben ser > 0)");
        System.out.println("La división será el valor mayor entre el menor");
        int valor1 = -1;
        int valor2 = -1;
            System.out.print("\n · Introduzca el valor 1: ");
            valor1 = solicitarNumeroPositivo(teclado);
            System.out.print(" · Introduzca el valor 2: ");
            valor2 = solicitarNumeroPositivo(teclado);

            if (valor1 > valor2 || valor1 == valor2) {
                int cociente = valor1 / valor2;
                int resto = valor1 % valor2;
                System.out.println("\nEl resultado de dividir " + valor1 + "/" + valor2 + " da como resultado de cociente: " +
                        cociente + " y de resto: " + resto);
            } else {
                int cociente = valor2 / valor1;
                int resto = valor2 % valor1;
                System.out.println("\nEl resultado de dividir " + valor2 + "/" + valor1 + " da como resultado de cociente: " +
                        cociente + " y de resto: " + resto);
            }
    }

    private static int solicitarNumeroPositivo(Scanner teclado) {
        int numero;

        do {
            // Solicitar el número hasta que sea mayor que 0
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                teclado.next(); // Limpiar el buffer del scanner
            }

            numero = teclado.nextInt();

            if (numero <= 0) {
                System.out.println("El número debe ser mayor que 0. Inténtelo de nuevo.");
            }

        } while (numero <= 0);

        return numero;
    }
}
