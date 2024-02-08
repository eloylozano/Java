package Ejercicio03;

public class Main {
    public static void main(String[] args) {
        Punto centro = new Punto(10,20);

        Circulo circulo = new Circulo(centro, 4.5);

        System.out.println("El área es: " + circulo.calculararea());
    }
}