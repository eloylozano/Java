

public class Libra extends Moneda {
    private double cantidad;

    public Libra(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    protected double cantidadEnEuros() {
        double resultado = 0;
        resultado = this.cantidad * 1.1029861;
        return resultado;
    }
}
