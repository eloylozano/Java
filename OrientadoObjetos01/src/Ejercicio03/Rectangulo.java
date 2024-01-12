package Ejercicio03;

public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calcularPerimetro() {
        return 2 * (altura + base);
    }

    public float calcularArea() {
        return base * altura;
    }
}
