package Ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una velocidad para comprobar la respectiva pérdida de puntos: ");
        int velocidad = teclado.nextInt();

        if (velocidad < 120) {
            System.out.println(" · Su velocidad es correcta");
        } else if (velocidad >= 120 && velocidad <= 140) {
            System.out.println(" · La multa será de 1 punto");
        } else if (velocidad >= 141 && velocidad <= 150) {
            System.out.println(" · La multa será de 2 puntos");
        } else if (velocidad >= 151 && velocidad <= 160) {
            System.out.println(" · La multa será de 3 puntos");
        } else if (velocidad >= 161 && velocidad <= 180) {
            System.out.println(" · La multa será de 4 puntos");
        } else if (velocidad >= 181 && velocidad <= 190) {
            System.out.println(" · La multa será de 6 puntos");
        } else {
            System.out.println(" · La multa conlleva la pérdida del carnet");
        }
    }
}