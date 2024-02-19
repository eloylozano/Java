package Ejercicio03;


public class Circulo {

    private Punto centro;
    private double radio;
    private final static double PI = 3.14159;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public double calculararea(){
        return PI * radio * radio;
    }
}
