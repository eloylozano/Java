package Ejercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número para hallar el valor absoluto: ");
        double numeroIntroducido = teclado.nextDouble();
        if (numeroIntroducido < 0) {
            valorAbsoluto(numeroIntroducido);
        } else {
            System.out.println("El número " + numeroIntroducido + " ya es es valor absoluto");
        }
    }

    private static void valorAbsoluto(double numeroIntroducido) {
        double valorAbsoluto = (numeroIntroducido < 0) ? -numeroIntroducido : numeroIntroducido;
        System.out.println("Su valor absoluto es: " + valorAbsoluto);

    }
}
