package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        // Definimos variable suma = 0
        int suma = 0;

        // Bucle que empiece en 0, termine en 1000 y el paso sea == 2
        for (int n = 0; n <= 1000; n += 2) {

            // La variable suma será igual al total de los valores
            suma += n;
        }

        // Imprimimos resultado
        System.out.println("La suma de los números pares entre 1 y 1000 es: " + suma);

    }

}

