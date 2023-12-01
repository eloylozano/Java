package Ejercicio05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número para factorizar: ");
        int numero = teclado.nextInt();

        System.out.print(numero + " | ");

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.println(i);
                numero /= i;

                System.out.print(numero);

                if (numero > 1) {
                    System.out.print(" | ");
                }
            }
        }
    }
}