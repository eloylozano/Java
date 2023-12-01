package Ejercicio08;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Cremos la funcion Random
        Random numero = new Random();
        // Declarar array de longitud 12 salarios
        int[] salarios = new int[12];

        int sueldo = 0;
        int contador = 0;
        System.out.println("Esto es lo que ganan 12 empleados de mi empresa: ");

        // Recorremos el array asignando un número random a cada posición y se imprime
        for (int i = 0; i < salarios.length; i++) {
            sueldo = numero.nextInt(700, 1300);
            salarios[i] = sueldo;
            System.out.println(" · El empleado " + (i + 1) + " ha cobrado " + sueldo + "€");
        }


        System.out.println("-----------------------------------------------------");
        System.out.println("\nPero se han reajustado los empleados que cobran <800€");
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] < 800) {
                salarios[i] += 100;
                contador++;
            }

            System.out.println(" · El empleado " + (i + 1) + " ha cobrado " + salarios[i] + "€");
        }

        System.out.println("\nSe han modificado " + contador + " salarios");
    }
}