package Ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un valor para doblarlo: ");
        int valor = teclado.nextInt();
        doblarValor(valor);
    }

    private static void doblarValor(int valor) {
        valor *= 2;
        System.out.println("Ahora el número tiene un valor de: " + valor);
    }
}
