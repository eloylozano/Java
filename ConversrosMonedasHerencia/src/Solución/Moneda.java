package Solución;

public abstract class Moneda {
    // Se crea protected pq en el esquema lo indica como #
    protected double cantidad;

    public Moneda(double cantidad) {
        this.cantidad = cantidad;
    }

    protected abstract double cantidadEnEuros();
}