package Solución;

public class Dolar extends Moneda{


    private final static double CONVERSION_A_DOLAR = 0.883509299;

    public Dolar(double cantidad) {
        super(cantidad);
    }

    @Override
    protected double cantidadEnEuros() {
        double resultado = cantidad * CONVERSION_A_DOLAR;

        return resultado;
    }
}
