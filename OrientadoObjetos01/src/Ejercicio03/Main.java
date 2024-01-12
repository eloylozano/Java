package Ejercicio03;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo01 = new Rectangulo(7.5f, 4.6f);

        System.out.println("El rectángulo 01 tiene un perímetro de " + rectangulo01.calcularPerimetro() + " cm");
        System.out.println("El rectángulo 01 tiene un área de " + rectangulo01.calcularArea() + " cm²");
    }
}
