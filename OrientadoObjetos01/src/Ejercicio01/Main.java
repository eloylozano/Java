package Ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj("Casio", "X-300", 100, 10, true);
        Reloj reloj2 = new Reloj("Rolex", "J-5000", 400, 5, false);

        System.out.println("El precio total es: " + reloj1.getPrecio() + reloj2.getPrecio() + " €");
    }
}
