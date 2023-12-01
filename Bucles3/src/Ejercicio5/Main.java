package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad y la unidad de medida de origen
        System.out.print("Ingresa la cantidad de información: ");
        double cantidad = scanner.nextDouble();
        System.out.print("Ingresa la unidad de medida (bit, byte, KB, MB, GB): ");
        String unidadOrigen = scanner.next().toLowerCase();

        // Pedir la unidad de medida de destino
        System.out.print("Ingresa la unidad a la que deseas convertir (bit, byte, KB, MB, GB): ");
        String unidadDestino = scanner.next().toLowerCase();

        // Definir los factores de conversión
        double bitToByte = 0.125;
        double byteToKB = 0.001;
        double KBToMB = 0.001;
        double MBToGB = 0.001;

        // Realizar la conversión
        double resultado = cantidad;

        // Si la unidad introducida es igual cualquiera unidad hacer esa operación
        if (unidadOrigen.equals("bit")) {
            resultado *= bitToByte;
        } else if (unidadOrigen.equals("byte")) {
            resultado /= bitToByte;
        } else if (unidadOrigen.equals("kb")) {
            resultado /= byteToKB;
        } else if (unidadOrigen.equals("mb")) {
            resultado /= (byteToKB * KBToMB);
        } else if (unidadOrigen.equals("gb")) {
            resultado /= (byteToKB * KBToMB * MBToGB);
        } else {
            System.out.println("Unidad de medida de origen no válida.");
            return;
        }

        if (unidadDestino.equals("bit")) {
            resultado /= bitToByte;
        } else if (unidadDestino.equals("byte")) {
            resultado *= bitToByte;
        } else if (unidadDestino.equals("kb")) {
            resultado *= byteToKB;
        } else if (unidadDestino.equals("mb")) {
            resultado *= (byteToKB * KBToMB);
        } else if (unidadDestino.equals("gb")) {
            resultado *= (byteToKB * KBToMB * MBToGB);
        } else {
            System.out.println("Unidad de medida de destino no válida.");
            return;
        }

        // Mostrar el resultado de la conversión
        System.out.println("Resultado: " + resultado + " " + unidadDestino);

    }
}
