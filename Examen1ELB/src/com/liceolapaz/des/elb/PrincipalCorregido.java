package com.liceolapaz.des.elb;

import java.util.Random;
import java.util.Scanner;

public class PrincipalCorregido {
    static int opcionRaza;
    static int opcionClase;
    static int[] habilidades = new int[5];
    static int puntosExtras = 0;
    static String[] nombreHabilidades = {"Fuerza", "Destreza", "Inteligencia", "Sabiduría", "Carisma"};

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        do {
            menu();

            int opcion = teclado.nextInt();
            String[] razas = {"Humano", "Elfo", "Enano", "Orco", "Troll", "Gnomo"};
            String[] clases = {"Guerrero", "Cazador", "Clérigo", "Mago", "Druida", "Paladín", "Bardo"};

            switch (opcion) {
                case 1:
                    opcionRaza = aleatorio.nextInt(6);
                    break;
                case 2:
                    opcionClase = aleatorio.nextInt(7);
                    System.out.println(clases[opcionClase]);
                    break;
                case 3:
                    for (int i = 0; i < habilidades.length; i++) {
                        habilidades[i] = aleatorio.nextInt(20) + 1;
                    }
                    puntosExtras += 5;
                    break;
                case 4:
                    asignarPuntosExtras(teclado);
                    break;
                case 5:
                    mostrarPersonaje(razas, clases);
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

    private static void asignarPuntosExtras(Scanner scanner) {
        System.out.print("Ingrese la habilidad a la que desea asignar puntos extras: ");
        String habilidad = scanner.next();
        System.out.print("Ingrese la cantidad de puntos extras a asignar: ");
        int puntos = scanner.nextInt();

        if (puntosExtras >= puntos && habilidadValida(habilidad, puntos)) {
            int indice = obtenerIndiceHabilidad(habilidad);
            habilidades[indice] += puntos;
            puntosExtras -= puntos;
        } else {
            System.out.println("Error: No hay suficientes puntos extras o la asignación supera 20 puntos para la habilidad.");
        }
    }

    private static int obtenerIndiceHabilidad(String habilidad) {
        for (int i = 0; i < nombreHabilidades.length; i++) {
            if (nombreHabilidades[i].equalsIgnoreCase(habilidad)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean habilidadValida(String habilidad, int puntos) {
        int indice = -1;

        for (int i = 0; i < nombreHabilidades.length; i++) {
            if (nombreHabilidades[i].equalsIgnoreCase(habilidad)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            return habilidades[indice] + puntos <= 20;
        }
        return false;
    }

    private static void mostrarPersonaje(String[] razas, String[] clases) {
        System.out.println("Raza: " + razas[opcionRaza]);
        System.out.println("Clase: " + clases[opcionClase]);
        for (int i = 0; i < habilidades.length; i++) {
            System.out.println(nombreHabilidades[i] + ": " + habilidades[i]);
        }
    }
}