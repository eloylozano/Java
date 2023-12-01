package Ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un parámetro: ");
        int parametro = teclado.nextInt();

        for (int i = 0; i < parametro; i++) {
            System.out.println("Módulo ejecutándose...");
        }
    }
}
