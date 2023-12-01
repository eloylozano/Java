package com.liceolapaz.des.elb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Escribir menú
        escribirMenu();
        // Pedir opción
        pedirOPcion();
        // Leer opción y guardaremos el mensaje
        int opcion = leerOpcion();
        // Escribir mensaje dependiendo de la opción
        escribirMensaje(opcion);
    }


    private static void escribirMenu() {
        System.out.println("MENÚ OPCIONES\n" +
                "1. Opción 1\n" +
                "2. Opción 2\n" +
                "3. Opción 3\n" +
                "0. Salir");
    }

    private static void pedirOPcion() {
        System.out.println("Escriba una opción");
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void escribirMensaje(int opcion) {
        switch (opcion) {
            case 0:
                System.out.println("¡Hasta la próxima!");
                System.exit(0);
                break;
            case 1:
                System.out.println("Escogiste la opción 1");
                break;
            case 2:
                System.out.println("Escogiste la opción 2");
                break;
            case 3:
                System.out.println("Escogiste la opción 3");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
