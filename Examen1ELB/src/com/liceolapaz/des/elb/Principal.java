package com.liceolapaz.des.elb;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    static int opcionRaza;
    static int opcionClase;
    static int[] habilidades = new int[5];
    static int puntosExtra = 0;
    static String[] nombreHabilidades = {"Fuerza", "Destreza", "Inteligencia", "Sabiduría", "Carisma"};


    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        do {
            menu();

            int opcion = teclado.nextInt();
            String[] raza = {"Humano", "Elfo", "Enano", "Orco", "Troll", "Gnomo"};
            String[] clase = {"Guerrero", "Cazador", "Clérigo", "Mago", "Druida", "Paladín", "Bardo"};
            switch (opcion) {
                case 1:
                    opcionRaza = aleatorio.nextInt(6);
                    break;
                case 2:
                    opcionClase = aleatorio.nextInt(7);
                    System.out.println(clase[opcionClase]);
                    break;
                case 3:
                    for (int i = 0; i < habilidades.length; i++) {
                        habilidades[i] = aleatorio.nextInt(20) + 1;
                    }
                    System.out.println("Se han asignado los puntos a las 5 habilidades con éxito.");
                    System.out.print("\nQuieres 5 puntos de habilidad extra? (0 = NO, 1 = SI): ");
                    int respuestaExtra = teclado.nextInt();
                    if (respuestaExtra == 1) {
                        asignarPuntosExtrasAleatorios(teclado, aleatorio);
                    }
                    break;
                case 4:
                    asignarPuntosExtras();
                    break;
                case 5:
                    mostrarPersonaje(raza, clase);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escoge una opción válida!");
            }

        } while (true);
    }

    private static void menu() {
        System.out.println("\nCREACIÓN PERSONAJE ROL");
        System.out.println(" 1. Raza");
        System.out.println(" 2. Clase");
        System.out.println(" 3. Habilidades");
        System.out.println(" 4. Puntos extras");
        System.out.println(" 5. Mostrar personaje");
        System.out.println(" 0. Salir");
        System.out.print("\nEscoge una opción: ");
    }

    private static void asignarPuntosExtrasAleatorios(Scanner teclado, Random aleatorio) {
        System.out.print("Ingresa la cantidad de puntos extras (máximo 5): ");
        int puntos = teclado.nextInt();
        for (int i = 0; i < habilidades.length; i++) {
            int habilidadRandom = aleatorio.nextInt(5);
            habilidades[i] += habilidadRandom;
            if (habilidades[i] > 20){
                habilidades[i] = 20;
            }
        }
        puntosExtra = puntos;
    }

    private static void asignarPuntosExtras() {
        Random aleatorio = new Random();
        System.out.println("Asignar puntos extras a habilidades:");
        int totalPuntosExtras = 0;

        for (int i = 0; i < habilidades.length; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingresa puntos extras para " + nombreHabilidades[i] + " (máximo 5): ");
            int puntos = teclado.nextInt();

            if (puntos > 5) {
                System.out.println("No puedes asignar más de 5 puntos extras a una habilidad.");
                i--;
                continue;
            }

            if (totalPuntosExtras + puntos > 20) {
                System.out.println("La suma total de puntos extras no puede exceder 20. Vuelve a intentarlo.");
                System.out.println("\nDeberá asignar de nuevo los puntos aleatorios!");
                for (int j = 0; j < habilidades.length; j++) {
                    habilidades[j] = aleatorio.nextInt(20) + 1;
                }
                totalPuntosExtras = 0;
                i = -1;
                continue;
            }

            habilidades[i] += puntos;
            totalPuntosExtras += puntos;
        }

        System.out.println("Se han asignado los puntos extras con éxito.");
    }
    private static void mostrarPersonaje(String[] raza, String[] clase) {
        System.out.println("Raza: " + raza[opcionRaza]);
        System.out.println("Clase: " + clase[opcionClase]);
        for (int i = 0; i < habilidades.length; i++) {
            System.out.println(nombreHabilidades[i] + ": " + (habilidades[i] + puntosExtra));
        }
    }
}

