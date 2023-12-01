import java.util.Random;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menú");
        System.out.println(" 1. Jugar");
        System.out.println(" 0. Salir");
        System.out.print("\nEscoje una opción: ");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 0:
                System.exit(0);
                break;
            case 1:
                juego();
                break;
            default:
                System.out.println("Opción no válida!");
        }
    }

    private static void juego() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        String[] jugada = {"Piedra", "Papel", "Tijera"};
        System.out.print("\nIntroduce tu jugada (piedra, papel, tijera): ");
        String jugadaUsuario = teclado.nextLine().toLowerCase();
        int jugadaMaquina = aleatorio.nextInt(3);

        switch (jugadaUsuario) {
            case "papel":
                if (jugadaMaquina == 1) {
                    System.out.println("La máquina ha jugado " + jugada[jugadaMaquina]);
                    System.out.println("EMPATE!");
                } else if (jugadaMaquina == 2) {
                    System.out.println("La máquina ha jugado " + jugada[jugadaMaquina]);
                    System.out.println("PERDISTE!");
                } else if (jugadaMaquina == 3) {
                    System.out.println("La máquina ha jugado " + jugada[jugadaMaquina]);
                    System.out.println("GANASTE!");
                }
                break;


            case "piedra":
                if (jugadaMaquina == 2) {
                    System.out.println("La máquina ha jugado " + jugada[jugadaMaquina]);
                    System.out.println("GANASTE!");
                } else if (jugadaMaquina == 3) {
                    System.out.println("La máquina ha jugado " + jugada[jugadaMaquina]);
                    System.out.println("PERDISTE!");
                } else if (jugadaMaquina == 1) {
                    System.out.println("La máquina ha jugado " + jugada[jugadaMaquina]);
                    System.out.println("EMPATE!");
                }
                break;


            case "tijera":
                if (jugadaMaquina == 3) {
                    System.out.println("La máquina ha jugado " + jugada[jugadaMaquina]);
                    System.out.println("GANASTE!");
                } else if (jugadaMaquina == 1) {
                    System.out.println("La máquina ha jugado " + jugada[jugadaMaquina]);
                    System.out.println("PERDISTE!");
                } else if (jugadaMaquina == 2) {
                    System.out.println("La máquina ha jugado " + jugada[jugadaMaquina]);
                    System.out.println("EMPATE!");
                }
                break;
        }
    }
}