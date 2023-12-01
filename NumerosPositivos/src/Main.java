import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarar un array de 10 elementos
        int[] array = new int[10];

        // Introducir elementos en el array
        System.out.println("Introduce 10 números enteros positivos:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" · Valor " + (i + 1) + ": ");
            int valor = teclado.nextInt();

            if (valor < 0) {
                // Para que no almacene un número negativo solo restamos una posición para borrarla
                System.out.println("No se permiten números negativos");
                i--;
            } else {
                array[i] = valor;
            }
        }

        // Mostrar el array
        System.out.println("\nEl contenido del array es:");

        // Igualamos la posición a 10 (largo del array), y se resta 1 hasta que sea 0
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
