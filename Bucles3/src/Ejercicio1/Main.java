package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");

        // Varible long, por que necesitaremos muchos dígitos
        long numero = teclado.nextLong();

        // Creamos la variable para el resultado y la igualamos para que el tamaño total
        int bitsNecesarios = Long.SIZE - Long.numberOfLeadingZeros(Math.abs(numero)) + 1;

        System.out.println("Se necesitan " + bitsNecesarios + " bits para representar " + numero);

    }
}
