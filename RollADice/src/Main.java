import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        do {
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
        } while (true);
    }

    private static void juego() {
        Random aleatorio = new Random();
        int lanzamiento = aleatorio.nextInt(6) + 1;

        System.out.println("\nHa salido " + lanzamiento);
        System.out.println("\n---------------------------------------------------");
    }
}
