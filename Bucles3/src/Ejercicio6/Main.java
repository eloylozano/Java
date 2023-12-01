package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada para introducir el número
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número de hasta 5 cifras: ");
        int numero = teclado.nextInt();
        teclado.close();

        // Mensaje de error, si el número se pasa de longitud
        if (numero < 0 || numero > 99999) {
            System.out.println("Número fuera de rango. Debe estar entre 0 y 99999.");
        } else {
            String numeroEnPalabras = convertirNumeroEnPalabras(numero);
            System.out.println(numeroEnPalabras);
        }
    }

    public static String convertirNumeroEnPalabras(int numero) {
        // Definimos las cadenas de texto para unidades decenas y centenas
        String[] unidades = {"", "un", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};

        // Se definen las variables dependiendo del valor que tenga nuestor número
        int unidad = numero % 10;
        int decena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int millar = (numero / 1000) % 10;

        // Creamos la clase stringbuilder, para hacer la unión de la frase
        StringBuilder palabras = new StringBuilder();

        // Si el millar es mayor a 0 entonces hacer el cálculo y sutituir mil, por el valor que de
        if (millar > 0) {
            palabras.append(unidades[millar]);
            palabras.append(" mil ");
        }

        // Si la centena es mayor a 0 entonces hacer el cálculo y sutituir cientos, por el valor que de
        if (centena > 0) {
            palabras.append(unidades[centena]);
            palabras.append("cientos ");
        }

        // Si la centena es mayor a 0 e igual a 1, sustiuir por la unidad, en otro caso añadir la conjunción y si es > 1
        if (decena > 0) {
            if (decena == 1) {
                palabras.append(especiales[unidad]);
            } else {
                palabras.append(decenas[decena]);
                if (unidad > 0) {
                    palabras.append(" y ");
                    palabras.append(unidades[unidad]);
                }
            }
        // Si no poner la unidad directamente o 0 en el caso de que sea == 0
        } else if (unidad > 0) {
            palabras.append(unidades[unidad]);
        } else if (numero == 0) {
            palabras.append("cero");
        }

        return palabras.toString();
    }
}
