

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        numero();
        int opcion;
        opcion = leerNumero();
         switch (opcion) {
             case 1:
                 System.out.println("Ha escogido la opción 1.\n");
                 break;
             case 2:
                 System.out.println("Ha escogido la opción 2.\n");
                 break;
             case 0:
                 System.out.println("Ha escogido salir.");
                 break;
             default:
                 System.out.println("Opción no válida");
         }

    }

    private static void numero() {
        System.out.println("ADIVINA EL NÚMERO:\n" +
                "1. Del 1 al 10 (3 intentos)\n" +
                "2. Del 1 al 50 (5 intentos)\n" +
                "0. Salir\n" +
                "Escoja una opción:");
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
}