package Ejercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deberá la valorar la siguiente películca");
        int valoracion = 0;
        do {
            System.out.print(" · Introduce tu valoración (1-5): ");
            valoracion = teclado.nextInt();

            switch (valoracion){
                case 1:
                    System.out.println("\n" + valoracion + " -> Mala");
                    break;
                case 2:
                    System.out.println("\n" + valoracion + " -> Regular");
                    break;
                case 3:
                    System.out.println("\n" + valoracion + " -> Buena");
                    break;
                case 4:
                    System.out.println("\n" + valoracion + " -> Excelente");
                    break;
                case 5:
                    System.out.println("\n" + valoracion + " -> Obra Maestra");
                    break;
            }
        } while (valoracion < 1 || valoracion > 5);
    }
}
