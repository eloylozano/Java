package Ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada para pedir una carta
        System.out.print("Introduce una carta (por ejemplo, 2C para 2 de Corazones): ");
        String cartaIngresada = scanner.next();

        // Validar la carta
        if (validarCarta(cartaIngresada)) {
            // Imprimir la carta ingresada
            System.out.println("Carta ingresada: " + cartaIngresada);

            // Imprimir las siguientes 4 cartas para hacer un póker
            imprimirSiguientesCuatro(cartaIngresada);
        } else {
            System.out.println("Carta no válida. Por favor, ingresa una carta en el formato correcto.");
        }
    }

    // Método para verificar si la carta ingresada es válida
    private static boolean validarCarta(String carta) {
        String[] numerosValidos = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] palosValidos = {"P", "D", "C", "T"};

        // Verificar si la carta tiene un número y un palo válidos
        return carta.length() == 2 &&
                contiene(numerosValidos, carta.substring(0, 1)) &&
                contiene(palosValidos, carta.substring(1));
    }

    // Método para verificar si un array contiene un elemento
    private static boolean contiene(String[] array, String elemento) {
        for (String item : array) {
            if (item.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    // Método para imprimir las siguientes 4 cartas
    private static void imprimirSiguientesCuatro(String carta) {
        String[] numeros = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
            String[] palos = {"P", "D", "C", "T"};

        int numeroIndex = obtenerIndice(numeros, carta.substring(0, 1));
        int paloIndex = obtenerIndice(palos, carta.substring(1));

        // Imprimir las siguientes 4 cartas para hacer un póker
        System.out.print("Siguientes 4 valores: ");
        for (int i = 1; i <= 4; i++) {
            int siguienteNumeroIndex = (numeroIndex + i) % numeros.length;
            System.out.print(numeros[siguienteNumeroIndex] + palos[paloIndex] + " ");
        }
    }

    // Método para obtener el índice de un elemento en un array
    private static int obtenerIndice(String[] array, String elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
