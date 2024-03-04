public class Pentagono implements FiguraGeometrica {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return (calcularPerimetro() * apotema)/2;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 5;
    }
}
