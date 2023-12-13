package com.liceolapaz.des.elb;

import java.util.Random;
import java.util.Scanner;

public class Solucion {
    private static String raza = "";
    private static String clase = "";
    private static int fuerza = 0;
    private static int destreza = 0;
    private static int inteligencia = 0;
    private static int sabiduria = 0;
    private static int carisma = 0;
    private static int puntosExtras = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    generarRaza();
                    break;
                case 2:
                    generarClase();
                    break;
                case 3:
                    generarHabilidades();
                    break;
                case 4:
                    if (puntosExtras > 0) {
                        asignarPuntosExtras(scanner);
                    } else {
                        System.out.println("Error: No hay puntos extras disponibles.");
                    }
                    break;
                case 5:
                    mostrarPersonaje();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: Opción no válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("CREACIÓN PERSONAJE ROL");
        System.out.println("1. Raza");
        System.out.println("2. Clase");
        System.out.println("3. Habilidades");
        System.out.println("4. Puntos extras");
        System.out.println("5. Mostrar personaje");
        System.out.println("0. Salir");
        System.out.print("Escoja una opción: ");
    }

    private static void generarRaza() {
        String[] razas = {"Humano", "Elfo", "Enano", "Orco", "Troll", "Gnomo"};
        raza = razas[new Random().nextInt(razas.length)];
    }

    private static void generarClase() {
        String[] clases = {"Guerrero", "Cazador", "Clérigo", "Mago", "Druida", "Paladín", "Bardo"};
        clase = clases[new Random().nextInt(clases.length)];
    }

    private static void generarHabilidades() {
        fuerza = generarPuntos();
        destreza = generarPuntos();
        inteligencia = generarPuntos();
        sabiduria = generarPuntos();
        carisma = generarPuntos();
    }

    private static int generarPuntos() {
        return new Random().nextInt(20) + 1;
    }

    private static void asignarPuntosExtras(Scanner scanner) {
        System.out.print("Ingrese la habilidad a la que desea asignar puntos extras: ");
        String habilidad = scanner.next();
        System.out.print("Ingrese la cantidad de puntos extras a asignar: ");
        int puntos = scanner.nextInt();

        if (puntosExtras >= puntos && habilidadValida(habilidad, puntos)) {
            switch (habilidad) {
                case "Fuerza":
                    fuerza += puntos;
                    break;
                case "Destreza":
                    destreza += puntos;
                    break;
                case "Inteligencia":
                    inteligencia += puntos;
                    break;
                case "Sabiduria":
                    sabiduria += puntos;
                    break;
                case "Carisma":
                    carisma += puntos;
                    break;
            }
            puntosExtras -= puntos;
        } else {
            System.out.println("Error: No hay suficientes puntos extras o la asignación supera 20 puntos para la habilidad.");
        }
    }

    private static boolean habilidadValida(String habilidad, int puntos) {
        switch (habilidad) {
            case "Fuerza":
                return fuerza + puntos <= 20;
            case "Destreza":
                return destreza + puntos <= 20;
            case "Inteligencia":
                return inteligencia + puntos <= 20;
            case "Sabiduria":
                return sabiduria + puntos <= 20;
            case "Carisma":
                return carisma + puntos <= 20;
            default:
                return false;
        }
    }

    private static void mostrarPersonaje() {
        System.out.println("Raza: " + raza);
        System.out.println("Clase: " + clase);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Destreza: " + destreza);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Sabiduria: " + sabiduria);
        System.out.println("Carisma: " + carisma);
    }
}