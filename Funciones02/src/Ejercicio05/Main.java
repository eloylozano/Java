package Ejercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CALCULAR AREA Y VOLUMEN DE UN CILINDRO:");
        System.out.print(" · Introduce el radio: ");
        double radio = teclado.nextDouble();
        System.out.print(" · Introduce la altura: ");
        double altura = teclado.nextDouble();

        double area = calcularArea(radio);
        double volumen = calcularVolumen(altura, area);

        System.out.println("El area equivale a " + area);
        System.out.println("El volumen equivale a " + volumen);
    }

    private static double calcularVolumen(double altura, double areaBase) {
        double volumen = altura * areaBase;
        return volumen;
    }

    private static double calcularArea(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}
