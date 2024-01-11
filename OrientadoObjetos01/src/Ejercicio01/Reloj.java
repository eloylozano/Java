package Ejercicio01;

import java.util.Scanner;

public class Reloj {
    private String marca;
    private String modelo;
    private int precio;
    private int unidades;
    private boolean esDigital;

    public Reloj(String marca, String modelo, int precio, int unidades, boolean esDigital) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.unidades = unidades;
        this.esDigital = esDigital;
    }

    public int getPrecio() {
        return precio;
    }
}
