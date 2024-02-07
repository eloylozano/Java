

public class Dolar extends Moneda {
    private double cantidad;

    public Dolar(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    protected double cantidadEnEuros() {
        double resultado = 0;
        resultado = this.cantidad * 0.883509299;
        return resultado;
        //Esto equivale a double resultado = this.cantidad * 0.883509299;  return resultado;
        //Tambien equivale a return this.cantidad * 0.883509299;
    }
}
