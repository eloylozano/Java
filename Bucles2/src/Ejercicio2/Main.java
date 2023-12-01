package Ejercicio2;

import java.util.Scanner;

public class Main {



    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        // Creamos una entrada para introducir un número
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");

        // Esta entrada será la variable "n".
        int n = teclado.nextInt();
        teclado.close();

        // Creamos una variable con decimales, la cual denominamos suma
        double suma = 0;

        // Bucle donde la suma empezará en 1 y será menor a la variable n.
        for (int i = 1; i <= n; i++) {
            //Se repetirá la suma añadiendo +1 y diviendo entre i (que a la vez se le va sumando +1)
            suma += 1 / i;
        }

        //Imprimimos el resultado de la suma
        System.out.println("La suma de 1/1 + 1/2 + 1/3 + ... + 1/" + n + " es igual a: " + suma);
    }

}
