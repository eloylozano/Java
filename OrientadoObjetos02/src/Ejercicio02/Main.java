package Ejercicio02;

public class Main {
    public static void main(String[] args) {
        Punto mi_punto = new Punto(10, 40);
        mi_punto.asignarNombre("Punto01");

        System.out.println("Antes desplazar");
        System.out.println(mi_punto.puntoDesplazado());

        mi_punto.desplaza_x(5);

        System.out.println("Después Desplazar");
        System.out.println(mi_punto.puntoDesplazado());

    }
}