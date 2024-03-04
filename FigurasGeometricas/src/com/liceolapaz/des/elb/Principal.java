package com.liceolapaz.des.elb;

import java.util.Scanner;

public class Principal {

    private static void menuPrincipal() {
        System.out.println("\nFIGURAS GEOMÉTRICAS");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Pentágono");
        System.out.println("0. Salir");
        System.out.print("Escoja una opción: ");
    }

    private static int opcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void calcularArea() {
        System.out.println("\nPara calcular el área debes: ");
    }

    private static double baseTriangulo() {
        System.out.print(" - Escribir la base: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double alturaTriangulo() {
        System.out.print(" - Escribir la altura: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void resultadoTriangulo(double areaTriangulo, double perimetroTriangulo) {
        System.out.println("El área da un total de: " + (String.format("%.2f", areaTriangulo) + " y su perímetro: " + String.format("%.2f", perimetroTriangulo)));

    }

    private static double ladoCuadrado() {
        System.out.print(" - Escriba el lado del cuadrado: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void resultadoCuadrado(double areaCuadrado, double perimetroCuadrado) {
        System.out.println("El área da un total de " + (String.format("%.2f", areaCuadrado) + " y su perímetro " + String.format("%.2f", perimetroCuadrado)));
    }

    private static double baseRectangulo() {
        System.out.print(" - Escribe la base del rectángulo: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double alturaRectangulo() {
        System.out.print(" - Escibre la altura del rectángulo: ");
        Scanner teclado2 = new Scanner(System.in);
        return teclado2.nextDouble();
    }

    private static void resultadoRectangulo(double areaRectangulo, double perimetroRectangulo) {
        System.out.println("El área da un total de " + (String.format("%.2f", areaRectangulo) + " y su perímetro " + String.format("%.2f", perimetroRectangulo)));
    }

    private static double ladoPentagono() {
        System.out.print(" - Escribe el tamaño de un lado: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double nLadosPentagono() {
        System.out.print(" - Escribe el número de lados: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void resultadoPentagono(double areaPentagono, double perimetroPentagono) {
        System.out.println("El resultado del área da un total de: " + (String.format("%.2f", areaPentagono) + " y el perímetro tiene un total de: " + (String.format("%.2f", perimetroPentagono))));
    }
    //------------------------------------------------------------------------------------------------ -----

    public static void main(String[] args) {
        do {
            //Se escribe el menú principal
            menuPrincipal();
            //Se crea variable para escoger opción
            int opcion = opcion();
            //Dependiendo de la opción que escojamos
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    calcularArea();
                    double baseTriangulo = baseTriangulo();
                    double alturaTriangulo = alturaTriangulo();
                    double perimetroTriangulo = (Math.sqrt(2 * (alturaTriangulo + baseTriangulo))) * 3;
                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                    resultadoTriangulo(areaTriangulo, perimetroTriangulo);
                    break;
                case 2:
                    double baseRectangulo = baseRectangulo();
                    double alturaRectangulo = alturaRectangulo();
                    double areaRectangulo = baseRectangulo * alturaRectangulo;
                    double perimetroRectangulo = baseRectangulo + baseRectangulo + alturaRectangulo + alturaRectangulo;
                    resultadoRectangulo(areaRectangulo, perimetroRectangulo);
                    break;
                case 3:
                    double ladoCuadrado = ladoCuadrado();
                    double areaCuadrado = ladoCuadrado * ladoCuadrado;
                    double perimetroCuadrado = ladoCuadrado * 4;
                    resultadoCuadrado(areaCuadrado, perimetroCuadrado);
                    break;
                case 4:
                    double ladoPentagono = ladoPentagono();
                    double nLadosPentagono = nLadosPentagono();
                    double perimetroPentagono = ladoPentagono * nLadosPentagono;
                    double apotemaPentagono = Math.sqrt((ladoPentagono * ladoPentagono) - ((ladoPentagono / 2) * (ladoPentagono / 2)));
                    double areaPentagono = (perimetroPentagono * apotemaPentagono) / 2;
                    resultadoPentagono(areaPentagono, perimetroPentagono);
                    break;
                default:
                    System.out.println("Opción no válida!");
            }
        } while (true);
    }


}
