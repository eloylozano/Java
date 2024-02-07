
public class Yen extends Moneda {
    private double cantidad;

    public Yen(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    protected double cantidadEnEuros() {
        double resultado = 0;
        resultado = this.cantidad * 0.00779327499;
        return resultado;
    }
}