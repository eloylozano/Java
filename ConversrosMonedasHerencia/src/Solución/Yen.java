package Solución;

public class Yen extends Moneda {

    private static  final double CONVERSOR_A_YEN = 0.00779327499;

    public Yen(double cantidad) {
        super(cantidad);
    }

    @Override
    protected double cantidadEnEuros() {
        double resultado = cantidad * CONVERSOR_A_YEN;
        return resultado;
    }
}
