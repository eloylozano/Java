package Ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");

        // Definimos la variable con la entrada
        int divisor = teclado.nextInt();

        //Creamos un string para crear el binario
        String binario="";

        // Variable para el cociente
        int cociente = 1;

        // Mientras que el cociente sea distinto de 0 se repetirá
        while(cociente != 0) {

            // Se divide entre 2 y se le da valor al cociente
            cociente = divisor/2;

            // Se crea la variable resto para poder crear el binario
            int resto = divisor%2;

            // Sustituímos para poder realizar de nuevo la división
            divisor = cociente;

            // Con el resto de las divisiones se suma al String
            binario = resto + binario;
        }

        // Cuando el cociente sea 0 se imprimirá el valor
        System.out.println(binario);
        teclado.close();
    }
}
