package Ejercicio01;

import java.math.BigDecimal;

public class Pendrive {
    private String marca;
    private String modelo;
    public int capacidad;
    public BigDecimal precio;
    private static final BigDecimal IVA = new BigDecimal("0.18");

    public Pendrive(String marca, String modelo, int capacidad, BigDecimal precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public BigDecimal calcularPrecioConIVA() {
        return precio.add( precio.multiply(IVA));
    }
}