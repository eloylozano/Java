import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenú lanzar moneda:");
            System.out.println(" 1. Jugar");
            System.out.println(" 0. Salir");
            System.out.print("\nEscoge una opción: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    int moneda = aleatorio.nextInt(2);
                    String[] ladosMoneda = {"Cara", "Cruz"};
                    System.out.println("Ha salido " + ladosMoneda[moneda]);
                    break;
                default:
                    System.out.println("Opción no válida!");
            }
        }
    }
}
