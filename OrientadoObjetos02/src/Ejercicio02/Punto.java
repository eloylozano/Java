package Ejercicio02;

public class Punto {
    private int x;
    private int y;
    private String nombre;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }


    public void desplaza_x(int valor) {
        x += valor;
    }


    public String puntoDesplazado() {
        return (nombre + " (" + x + "," + y+ ")");
    }
}