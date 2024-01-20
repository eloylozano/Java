package Ejercicio03;

public class Rectangulo {
    private float base;
    private float altura;

    // Constructor
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el perímetro
    public float calcularPerimetro() {
        return 2 * (altura + base);
    }

    // Método para calcular el área
    public float calcularArea() {
        return base * altura;
    }
}