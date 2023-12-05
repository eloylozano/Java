package Ejercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        System.out.println("Divisores primos de " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
