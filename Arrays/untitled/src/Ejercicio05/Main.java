package Ejercicio05;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Se crea la entrada para el total de alumnos
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba el número máximo de alumnos: ");
        int totalAlumnos = teclado.nextInt();

        // Creamos un array para que cada alumno tenga una nota
        int[] notasAlumnos = new int[totalAlumnos];

        // Al igualar a -1 se actualizará en el siguiente ya que no está en el rango
        int notaMasAlta = -1;

        // Inicializamos la nota más baja con un valor alto.
        int notaMasBaja = 11;


        // Creamos la clase random para asignar
        Random notas = new Random();

        // El array se recorre asignando una nota random a cada alumno
        for (int i = 0; i < notasAlumnos.length; i++) {
            int resultado = notas.nextInt(10) + 1;
            notasAlumnos[i] = resultado;

            // Verificamos si la nota actual es la más alta.
            if (resultado > notaMasAlta) {
                notaMasAlta = resultado;
            }

            // Verificamos si la nota actual es la más baja.
            if (resultado < notaMasBaja) {
                notaMasBaja = resultado;
            }


            System.out.println("El alumno " + (i + 1) + " ha obtenido una nota de: " + resultado);
        }

        // Imprimimos la nota más alta.
        System.out.println("La nota más alta entre los alumnos es: " + notaMasAlta);
        // Imprimimos la nota más baja.
        System.out.println("La nota más alta entre los alumnos es: " + notaMasBaja);
    }
}
