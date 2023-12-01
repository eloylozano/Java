package com.des.liceolapaz.des.elb;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir número a buscar al usuario
        pedirNumeroBuscar();
        // Leer número a buscary guardarlo
        int numeroBuscar = leerEntero ();
        // Pedir número máximo de intentos
        pedirMaximoIntentos();
        // Leer número máximo de intentos y guardarlo
        int maximoIntentos = leerEntero();
        // Generar números aleatorios hasta
        int numeroIntentos = 0;
        while (numeroIntentos < maximoIntentos) {
            // Generar número aleatorio y guardarlo
            int numeroAleatorio = generarNumeroAleatorio(1, 10);
            //Escribir el número aleatorio generado
        System.out.println("El número aleatorio generado es " + numeroAleatorio);
            // Sumar un intento
        numeroIntentos++;
            // Comprobar si encontramos el número a buscar
            if (numeroAleatorio == numeroBuscar) {
                System.out.println("Numero encontrado en " + numeroIntentos + " intento(s)");
                break;
            }
            // Si no encontramos el número
            else if (numeroIntentos == maximoIntentos) {
                System.out.println("Número no encontrado en: " + numeroIntentos + " intento(s)");
            }
    }
}

    private static void pedirNumeroBuscar() {
        System.out.print("Escriba un número entero del 1 al 10: ");
    }

    private static int leerEntero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirMaximoIntentos() {
        System.out.print("Escriba el número máximo de intentos: ");
    }

    private static int generarNumeroAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
