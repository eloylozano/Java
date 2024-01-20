package Ejercicio02;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int num_rueda;
    private int precio;

    public Vehiculo(String marca, String modelo, String color, int num_rueda, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.num_rueda = num_rueda;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", num_rueda=" + num_rueda +
                ", precio=" + precio +
                '}';
    }

    public float precio_IVA() {
        // Supongamos que el IVA es del 21%
        float iva = 0.21f;
        return precio * (1 + iva);
    }
}