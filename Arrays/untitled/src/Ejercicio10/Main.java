package Ejercicio10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random precioRandom = new Random();
        int[] articulos = new int[10];

        System.out.println("Los siguientes artículos tienen un valor de: ");

        // Generar precios y almacenar en el array
        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = precioRandom.nextInt(50) + 1;
            System.out.println(" · Artículo " + (i + 1) + " : " + articulos[i] + "€");
        }

        System.out.println("\n------------------------------------------------");

        // Llamada al método calcularPrecios
        calcularPrecios(articulos);
    }

//----------------------------------------------------------------------------------------

    public static void calcularPrecios(int[] precios) {
        // Creamos las variables para el valor más alto y más bajo
        int precioMaximo = precios[0];
        int precioMinimo = precios[0];

        // Recorremos el array buscando el mayor y menor precio
        for (int i = 1; i < precios.length; i++) {
            // Si hay algún valor mayor al máximo, guardarlo
            if (precios[i] > precioMaximo) {
                precioMaximo = precios[i];
            }
            // Si hay algún valor menor al mínimo, guardarlo
            if (precios[i] < precioMinimo) {
                precioMinimo = precios[i];
            }
        }

        // Se crea la variable para indicar el precio medio]
        double precioMedio = precios[0];

        // Se recorren todos los precios para sumarlos
        for (int i = 1; i < precios.length; i++) {
            precioMedio += precios[i];
        }

        // Se divide entre el número de precios
        precioMedio /= precios.length;


        // Se imprimen los resultados
        System.out.println("\nEl artículo más caro es de " + precioMaximo + "€");
        System.out.println("\nEl artículo más barato es de " + precioMinimo + "€");
        System.out.println("\nEl precio medio de los artículos es de " + precioMedio + "€");
        System.out.println("\nLos artículos que valen menos de 30€ son: ");

        for (int i = 1; i < precios.length; i++) {
            if (precios[i] <= 30) {
                System.out.println(" · Artículo " + (i + 1) + " : " + precios[i] + "€");
            }

        }
    }
}
