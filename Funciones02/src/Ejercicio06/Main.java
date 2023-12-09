package Ejercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CALCULAR AREA Y VOLUMEN DE UN CILINDRO:");
        System.out.print(" · Introduce el radio: ");
        double radio = teclado.nextDouble();
        System.out.print(" · Introduce la altura: ");
        double altura = teclado.nextDouble();

        double[] resultados = calcularAreaYVolumen(radio, altura);

        System.out.println("El area equivale a " + resultados[0]);
        System.out.println("El volumen equivale a " + resultados[1]);
    }

    private static double[] calcularAreaYVolumen(double radio, double altura) {
        double area = Math.PI * Math.pow(radio, 2);
        double volumen = altura * area;

        double[] resultados = { area, volumen };
        return resultados;
    }
}
