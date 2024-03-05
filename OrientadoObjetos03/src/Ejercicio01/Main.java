package Ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randon = new Random();

        System.out.print("Escribe una pregunta para crear una encuesta: ");
        String pregunta = sc.nextLine();

        System.out.print("Escribe la opción A, para votar: ");
        String opcionA = sc.nextLine();

        System.out.print("Escribe la opción B, para votar: ");
        String opcionB = sc.nextLine();


        System.out.println("""
                ¿Cuánta gente votará?
                 1. Entre 0-10
                 2. Entre 0-100
                 3. Entre 0-1000""");
        System.out.print("Tu opción: ");

        int opcion;
        int genteVotando = 0;
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                genteVotando = randon.nextInt(10);
                break;
            case 2:
                genteVotando = randon.nextInt(90) + 10;
                break;
            case 3:
                genteVotando = randon.nextInt(900) + 100;
                break;
            default:
                System.out.println("Opción no válida");
        }

        int votosParaA = 0;
        int votosParaB = 0;
        for (int i = 0; i < genteVotando; i++) {
            int temp = randon.nextInt(100);
            if (temp <= 50) {
                votosParaA++;
            } else if (temp > 50) {
                votosParaB++;
            }
        }

        Encuesta encuesta01 = new Encuesta(pregunta, opcionA, opcionB, votosParaA, votosParaB);
        encuesta01.total_Votos();

    }
}
