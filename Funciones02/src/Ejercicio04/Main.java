package Ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 2 valores para imprimir los intermedios");
        System.out.print(" · Valor inicial: ");
        int valorInicial = teclado.nextInt();
        System.out.print(" · Valor final: ");
        int valorFinal = teclado.nextInt();

        for (int i = valorInicial; i <= valorFinal; i++) {
            System.out.print(i + " ");
        }
    }
}
