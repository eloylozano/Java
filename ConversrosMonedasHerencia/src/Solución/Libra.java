package Solución;

public class Libra extends Moneda {

    private static  final double CONVERSOR_A_LIBRA = 1.1029861;

    public Libra(double cantidad) {
        super(cantidad);
    }

    @Override
    protected double cantidadEnEuros() {
        double resultado = cantidad * CONVERSOR_A_LIBRA;
        return resultado;
    }
}
