package Ejercicio01;

public class Reloj {
    private String marca;
    private String modelo;
    private int precio;
    private int stock;
    private boolean esDigital;

    public Reloj(String marca, String modelo, int precio, int stock, boolean esDigital) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.esDigital = esDigital;
    }

    public int getPrecio() {
        return precio;
    }
}
