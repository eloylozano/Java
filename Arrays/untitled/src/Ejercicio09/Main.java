package Ejercicio09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entrada para leer y guardar el número
        Scanner teclado = new Scanner(System.in);
        System.out.print("Intruduce tú número del DNI\n · ");
        int numeroDNI = teclado.nextInt();

        // Calculamos el resto de la operación
        int valor = numeroDNI % 23;

        // Declaramos el array con 23 letras
        String[] letraDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        System.out.println("\nTu DNI completo es: "+ numeroDNI+ letraDNI[valor]);
    }
}