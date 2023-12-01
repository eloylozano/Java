package Ejercicio3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Creamos una entrada para introducir el número
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el valor de n: ");

        //La entrada se asocia a la variable "n"
        int n = entrada.nextInt();

        // Si "n" igual o mayor a 0, imprimir el resultado 1
        if (n >= 0) {
            double resultado = 1;

            // Bucle que empieza en 1 y termina en "n"
            for (int i = 1; i <= n; i++) {

                // El resultado pasará a ser multiplicado por i+1
                resultado = resultado * i;
            }

            //Se imprime el resultado
            System.out.println(resultado);
        }
        //Excepto que sea valor negativo
        else System.out.println("Valor inválido");

        entrada.close();

    }
}
