package Ejercicio05;

public class Artista {
    private String nombre;
    private String pais;
    private int nacimiento;

    public Artista(String nombre, String pais, int nacimiento) {
        this.nombre = nombre;
        this.pais = pais;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    private int edad() {
        return 2024 - nacimiento;
    }

    public void ver_datos() {
        System.out.println("El/La artista" + nombre + " tiene " + edad() + " años y es de " + pais+ ".");

    }
}
