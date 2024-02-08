package Ejercicio04;

import com.sun.security.jgss.GSSUtil;

class Circulo {

    private Punto centro;
    private double radio;
    private final static double PI = 3.14159;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularLongitudCircunferencia() {
        return 2 * PI * radio;
    }

    public void ver_datos() {
        System.out.println("Radio: " + radio);
    }
}
