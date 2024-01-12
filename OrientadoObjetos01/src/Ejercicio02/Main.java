package Ejercicio02;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo01 = new Vehiculo("Seat", "Ibiza", "Rojo", 4, 11500);
        Vehiculo vehiculo02 = new Vehiculo("Yamaha", "MT-03", "Negro", 2, 6000);

        System.out.println("Vehiculo 01: " + vehiculo01);
        System.out.println("Precio con IVA: " + vehiculo01.precio_IVA());

        System.out.println("\nVehiculo 02: " + vehiculo02);
        System.out.println("Precio con IVA: " + vehiculo02.precio_IVA());
    }
}
