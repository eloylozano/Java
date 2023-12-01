package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creamos la entrada para definir las dos variables
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un valor para la base: ");
        int base = teclado.nextInt();
        System.out.print("Introduce un valor para el exponente: ");
        int exponente = teclado.nextInt();

        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }

        System.out.println("El resultado de elevar " + base + " a " + exponente + " da un total de: " + resultado);
    }
}
