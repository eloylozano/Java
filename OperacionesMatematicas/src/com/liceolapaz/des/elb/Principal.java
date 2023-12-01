package com.liceolapaz.des.elb;

import java.util.Scanner;

public class Principal {
    private static void menuprincipal() {
        System.out.println("\nPOTENCIAS Y RAICES CUADRADAS");
        System.out.println("1. Potencia");
        System.out.println("2. Raíz Cuadrada");
        System.out.println("0. Salir");
    }

    private static int opcion() {
        System.out.print("Escoja una opción: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static int valorBase() {
        System.out.print(" - Indica el valor de la base: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static int valorExponente() {
        System.out.print(" - Indica el valor del exponente: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void resultadoPotencia(double resultadoPotencia, int valorBase, int valorExponente) {
        System.out.println("El resultado de " + valorBase + "^" + valorExponente + " da un total de: " + resultadoPotencia);
    }

    private static int valorOperando(){
        System.out.print(" - Introduce el valor del operando: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void resultadoRaizCuadrada(double resultadoRaizCuadrada, int valorOperando){
        System.out.println("\nEl resultado de la siguiente operación:");
        System.out.println("\n    ____");
        System.out.println("_ 2/");
        System.out.println(" \\/  "+ valorOperando + "   ==== " + (String.format("%.2f",resultadoRaizCuadrada)));
    }
    //----------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        do {
            // Se escribe el menú principal
            menuprincipal();
            // Se interpreta y se almacena la opcíón
            int opcion = opcion();
            if (opcion == 0) {
                // En el caso de 0 -> Salir
                System.exit(0);
            }
            // En el caso de 1 ->
            else if (opcion == 1) {
                // En el caso de 1 -> Potencia
                // Se interpreta y se guarda el valor de la base
                int valorBase = valorBase();
                // Se interpreta y se guarda el valor del exponente
                int valorExponente = valorExponente();
                // Aplicamos la funcion estática Math.pow, para elevar un número
                double resultadoPotencia = Math.pow(valorBase, valorExponente);
                // Creamos un método para escribir el resultado
                resultadoPotencia(resultadoPotencia, valorBase, valorExponente);
            }
            // En el caso de 2 -> Raiz Cuadrada
            else if (opcion == 2) {
                int valorOperando = valorOperando();
                double resultadoRaizCuadrada = Math.sqrt (valorOperando);
                resultadoRaizCuadrada(resultadoRaizCuadrada, valorOperando);

            }
            // Otra opción no está disponible
            else {
                System.out.println("Opción no válida!");
            }
        } while (true);
    }
}
