import java.util.Random;
import java.util.Scanner;

public class Solucion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
                // Opciones del juego
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

        // Solicitar al usuario que elija una opción
        System.out.print("Elige una opción (Piedra, Papel, Tijera, Lagarto, Spock): ");
        String eleccionUsuario = scanner.nextLine();

        // Validar la elección del usuario
        if (!esOpcionValida(eleccionUsuario, opciones)) {
            System.out.println("Opción no válida. Por favor, elige una opción válida.");
            return;
        }

        // Generar la elección aleatoria de la computadora
        String eleccionComputadora = opciones[random.nextInt(opciones.length)];

        // Mostrar las elecciones
        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección de la computadora: " + eleccionComputadora);

        // Determinar el ganador
        determinarGanador(eleccionUsuario, eleccionComputadora);
    }

    // Método para verificar si la elección del usuario es válida
    private static boolean esOpcionValida(String eleccion, String[] opciones) {
        for (String opcion : opciones) {
            if (opcion.equalsIgnoreCase(eleccion)) {
                return true;
            }
        }
        return false;
    }

    // Método para determinar el ganador del juego
    private static void determinarGanador(String eleccionUsuario, String eleccionComputadora) {
        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if (gana(eleccionUsuario, eleccionComputadora)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("La computadora gana. ¡Mejor suerte la próxima vez!");
        }
    }

    // Método para determinar si el usuario gana
    private static boolean gana(String eleccionUsuario, String eleccionComputadora) {
        return (eleccionUsuario.equalsIgnoreCase("Piedra") && (eleccionComputadora.equalsIgnoreCase("Tijera") || eleccionComputadora.equalsIgnoreCase("Lagarto"))) ||
                (eleccionUsuario.equalsIgnoreCase("Papel") && (eleccionComputadora.equalsIgnoreCase("Piedra") || eleccionComputadora.equalsIgnoreCase("Spock"))) ||
                (eleccionUsuario.equalsIgnoreCase("Tijera") && (eleccionComputadora.equalsIgnoreCase("Papel") || eleccionComputadora.equalsIgnoreCase("Lagarto"))) ||
                (eleccionUsuario.equalsIgnoreCase("Lagarto") && (eleccionComputadora.equalsIgnoreCase("Papel") || eleccionComputadora.equalsIgnoreCase("Spock"))) ||
                (eleccionUsuario.equalsIgnoreCase("Spock") && (eleccionComputadora.equalsIgnoreCase("Piedra") || eleccionComputadora.equalsIgnoreCase("Tijera")));
    }
}
