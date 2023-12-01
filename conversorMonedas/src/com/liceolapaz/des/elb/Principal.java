package com.liceolapaz.des.elb;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    private static void menu() {
        System.out.println("CONVERSOR DE MONEDAS");
        System.out.println("1. Dólares");
        System.out.println("2. Libras");
        System.out.println("3. Yens");
        System.out.println("0. Salir");
    }

    private static int escogerOpcion() {
        System.out.print("Escoja una opción: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static double cantidadMonetaria() {
        System.out.print("Escriba la cantidad en euros que desea convertir: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void resultado(int opcion, double cantidad) {
        switch (opcion) {
            case 1:
                DecimalFormat df = new DecimalFormat("#.00");
                System.out.println("La conversión a dólares da un total de: " + df.format(cantidad / 0.86) + "$");
                break;
            case 2:
                DecimalFormat df2 = new DecimalFormat("#.00");
                System.out.println("La conversión a libras da un total de: " + df2.format(cantidad / 1.19) + "£");
                break;
            case 3:
                DecimalFormat df3 = new DecimalFormat("#.00");
                System.out.println("La conversión a yenes da un total de: " + df3.format(cantidad / 0.0075) + "¥");
                break;
        }
    }

    //--------------------------------------------------------------------------------------

    public static void main(String[] args) {
        do {
            // Imprimimos el menú en pantalla
            menu();
            // Daremos a escoger una opción y guardarla
            int opcion = escogerOpcion();
            // Si cogemos la opción de salir
            if (opcion == 0) {
                System.out.println("Ha salido del programa!");
                System.exit(0);
            }
            // Sino escoge la opción 0 y decide realizar una conversión
            else if (opcion == 1 || opcion == 2 || opcion == 3) {
                // Escoger cantidad
                double cantidad = cantidadMonetaria();
                resultado(opcion, cantidad);

            } else {
                System.out.println("Opción no válida!");
            }
        } while (true);


    }


}
