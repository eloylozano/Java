package Ejercicio02;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo("Seat", "Ibiza", "Rojo", 4, 11500);
        Vehiculo moto = new Vehiculo("Yamaha", "MT-03", "Negro", 2, 600);

        System.out.println(coche.toString());
        System.out.println(moto.toString());

        System.out.println("\nCoche = " + coche.precio_IVA());
        System.out.println("Moto = " + moto.precio_IVA());
    }
}
