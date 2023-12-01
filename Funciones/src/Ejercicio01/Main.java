package Ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos variables para intercambiarlas: ");
        System.out.print(" · Variable 1: ");
        String variable1 = teclado.nextLine();
        System.out.print(" · Variable 2: ");
        String variable2 = teclado.nextLine();

        String[] resultado = intercambiarVariables(variable1, variable2);

        System.out.println("\nAhora se han intercambiado las variables");
        System.out.println(" · Variable 1: " + resultado[0]);
        System.out.println(" · Variable 2: " + resultado[1]);
    }

    private static String[] intercambiarVariables(String variable1, String variable2) {
        String[] resultado = new String[2];
        resultado[0] = variable2;
        resultado[1] = variable1;

        return resultado;
    }
}