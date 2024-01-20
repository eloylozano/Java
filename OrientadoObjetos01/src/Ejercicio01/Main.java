package Ejercicio01;

public class Main {
    public static void main(String[] args) {
        Reloj reloj01 = new Reloj("Casio", "X-300", 100, 10, true);
        Reloj reloj02 = new Reloj("Rolex", "j-5000", 400, 5,false);

        System.out.println("El precio total es: " + (reloj01.getPrecio() + reloj02.getPrecio()) + " €");
    }
}
