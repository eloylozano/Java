public class Triangulo implements FiguraGeometrica{

    private double base;
    private double lado2;
    private double lado3;
    private double altura;

    public Triangulo(double base, double lado2, double lado3, double altura) {
        this.base = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado2 + lado3;
    }
}