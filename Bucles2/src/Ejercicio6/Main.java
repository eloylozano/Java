package Ejercicio6;

import java.util.Scanner;

public class Main {

    // Función para verificar si un número es primo
    public static boolean Primo(int n) {

        //Si es menor a 1, devolver falso
        if (n <= 1) {
            return false;
        }

        // Verificar si "n" es divisible por algún número entre 2 y la raíz cuadrada de "n"
        for (int i = 2; i <= Math.sqrt(n); i++) {

            // Si "n" tiene como resto 0, no es primo
            if (n % i == 0) {
                return false;
            }
        }
        // Es primo si no es divisible por ningún número excepto 1 y sí mismo
        return true;
    }

    //------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 1000:");

        // Bucle que empiece en 2 y acabe en 1000, donde coja todos los primos
        for (int numero = 2; numero <= 1000; numero++) {
            if (Primo(numero)) {
                // Imprime el número
                System.out.print(numero);
                // Deja de margen un espacio
                System.out.println();
            }
        }
    }


}
