package Principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("\nConversor de Monedas:");
            System.out.println(" 1. Binario a Decimal");
            System.out.println(" 2. Decimal a Binario");
            System.out.println(" 0. Salir");
            System.out.print("\nIntroduce una opción: ");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.out.println("\nHa FINALIZADO el programa!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("\nEscribe un número en binario: ");
                    int binario = teclado.nextInt();

                    if (binario > 0) {
                        int decimalConvertido = binarioADecimal(binario);
                        System.out.println("El resultado es: " + decimalConvertido);
                    } else if (binario == 0) {
                        System.out.println("Introduce un valor > 0");
                    }

                    break;

                case 2:
                    System.out.print("Escribe un número en decimal: ");
                    int decimal = teclado.nextInt();

                    if (decimal > 0) {
                        String binarioConvertido = decimalABinario(decimal);
                        System.out.println("El resultado es: " + binarioConvertido);

                    } else if (decimal == 0) {
                        System.out.println("Introduce un valor > 0");
                    }
                    break;

                default:
                    System.out.println("La opción " + opcion + " no es una opción válida!");
            }
        } while (true);
    }

    private static int binarioADecimal(int binario) {
        int decimal = 0;
        int exponente = 0;

        while (binario > 0) {
            int digito = binario % 10;
            decimal += digito * Math.pow(2, exponente);
            binario /= 10;
            exponente++;
        }

        return decimal;
    }

    public static String decimalABinario(int decimal) {
        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            int residuo = decimal % 2;
            binario.insert(0, residuo);
            decimal /= 2;
        }
        return binario.toString();
    }
}
