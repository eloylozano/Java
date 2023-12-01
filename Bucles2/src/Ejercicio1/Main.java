package Ejercicio1;

import java.util.Scanner;

public class Main {
    private static int numero() {
        System.out.print("Indica el número de líneas para dibujar: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        // Se crea la variable asociada al método
        int numero = numero();

        // Se crea un bucle donde empieza en 1, el máx es el número introducido y se suman de 1 en 1.
        for (int i = 1; i <= numero; i++) {

            // Define las líneas donde se escribirán
            System.out.println();

            // Se crea un bucle para que cada línea tenga un aumento de *, por cada una
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }


    }
}
