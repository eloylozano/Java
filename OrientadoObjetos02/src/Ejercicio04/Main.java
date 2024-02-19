package Ejercicio04;

public class Main {
    public static void main(String[] args) {
        Punto mi_punto = new Punto(10, 20);

        Circulo circulo = new Circulo(mi_punto, 4.5);

        circulo.ver_datos();
        System.out.println("El área es: " + circulo.calcularArea());
        System.out.println("La longitud de la circunferencia es: " + circulo.calcularLongitudCircunferencia());
    }
}
