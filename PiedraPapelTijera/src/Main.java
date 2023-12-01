import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            Scanner teclado = new Scanner(System.in);
            Random aleatorio = new Random();

            // Se imprime el menú y se guarda la opción
            menu();
            int opcionJuego = teclado.nextInt();
            if (opcionJuego == 1) {
                // Opciones del juego
                String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

                // Turno del usuario
                System.out.print("Elige una opción (Piedra, Papel, Tijera, Lagarto, Spock): ");
                String jugadaUsuario = teclado.nextLine();

                // Comprobar la jugada del usuario
                if (!jugadaValida(jugadaUsuario, opciones)) {
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    return;
                }

                // Generar la elección aleatoria de la computadora
                String jugadaOrdenador = opciones[aleatorio.nextInt(opciones.length)];

                // Mostrar las elecciones
                System.out.println("Tu elección: " + jugadaUsuario);
                System.out.println("Elección de la computadora: " + jugadaOrdenador);

                // Determinar el ganador
                comprobarJugada(jugadaUsuario, jugadaOrdenador);
            } else{
                    System.exit(0);
            }
        } while (true);
    }

    private static int menu() {
        System.out.println("\nPIEDRA PAPEL TIJERAS LAGARTO SPOCK");
        System.out.println(" 1. Jugar");
        System.out.println(" 0. Salir");
        System.out.print("Escoja una opción: ");
        return 0;
    }

    // Método para verificar
    private static boolean jugadaValida(String jugadaUsuario, String[] opciones) {
        for (String i : opciones) {
            if (i.equalsIgnoreCase(jugadaUsuario)) {
                return true;
            }
        }
        return false;
    }

    private static void comprobarJugada(String jugadaUsuario, String jugadaOrdenador) {
        if (jugadaUsuario.equalsIgnoreCase(jugadaOrdenador)) {
            System.out.println("¡EMPATE!");
        } else if (gana(jugadaUsuario, jugadaOrdenador)) {
            System.out.println("¡TÚ GANAS!");
        } else {
            System.out.println("¡PERDISTE!");
        }
    }


    private static boolean gana(String jugadaUsuario, String jugadaOrdenador) {
        return (jugadaUsuario.equalsIgnoreCase("Piedra") && (jugadaOrdenador.equalsIgnoreCase("Tijera") || jugadaOrdenador.equalsIgnoreCase("Lagarto"))) ||
                (jugadaUsuario.equalsIgnoreCase("Papel") && (jugadaOrdenador.equalsIgnoreCase("Piedra") || jugadaOrdenador.equalsIgnoreCase("Spock"))) ||
                (jugadaUsuario.equalsIgnoreCase("Tijera") && (jugadaOrdenador.equalsIgnoreCase("Papel") || jugadaOrdenador.equalsIgnoreCase("Lagarto"))) ||
                (jugadaUsuario.equalsIgnoreCase("Lagarto") && (jugadaOrdenador.equalsIgnoreCase("Papel") || jugadaOrdenador.equalsIgnoreCase("Spock"))) ||
                (jugadaUsuario.equalsIgnoreCase("Spock") && (jugadaOrdenador.equalsIgnoreCase("Piedra") || jugadaOrdenador.equalsIgnoreCase("Tijera")));
    }
}