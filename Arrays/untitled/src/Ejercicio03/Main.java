package Ejercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear un array de días de la semana
        String[] semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Mostrar el contenido del array
        System.out.println("Días de la semana: ");
        for (int i = 0; i < semana.length; i++) {
            System.out.println(" · " + semana[i]);
        }


        Scanner teclado = new Scanner(System.in);
        // Buscar el día escrito en el array
        System.out.print("Escibe el día de la semana que quieras: ");
        String elementoBuscado = teclado.nextLine();
        
        // Inicializar la posición como -1 (no encontrado)
        int posicion = -1;

        for (int i = 0; i < semana.length; i++) {
            if (semana[i].equals(elementoBuscado)){
                posicion = i; // Elemento encontrado, guardar la posición
                break; // Salir del bucle
            }
        }

        // Mostrar el resultado de la búsqueda
        if (posicion != -1) {
            System.out.println("\nSe encontró el elemento '" + elementoBuscado + "' en la posición " + posicion + ".");
        } else {
            System.out.println("\nNo se encontró el elemento '" + elementoBuscado + "' en el array.");
        }
    }
}