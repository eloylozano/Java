package Ejercicio3;

import java.util.Scanner;

public class Main {
    private static final int plazasMotos = 10;
    private static final int plazasTurismos = 30;
    private static final int plazasCamiones = 8;

    private static int motos = 7;
    private static int turismos = 25;
    private static int camiones = 2;

    private static int opcionIO;
    private static void parkingInicial(){

        // Inicializamos las variablesX
        int plazasLibresMotos = plazasMotos - motos;
        int plazasLibresTurismos = plazasTurismos - turismos;
        int plazasLibresCamiones = plazasCamiones - camiones;


        // Creamos el menú
        System.out.println("\n  PARKING");
        System.out.println("============");
        System.out.println("\nVehículo    Ocupadas    Max Libres");
        System.out.println("----------------------------------");
        System.out.println("Moto             " + motos +"     "+ plazasMotos + "      "+ plazasLibresMotos);
        System.out.println("Turismos         " + turismos +"    "+ plazasTurismos + "      "+ plazasLibresTurismos);
        System.out.println("Camiones         " + camiones +"     "+ plazasCamiones + "       "+ plazasLibresCamiones);
        System.out.println("----------------------------------");
        System.out.println("\n  MENU");
        System.out.println("========");
        System.out.println(" 1. Entrada de vehículos");
        System.out.println(" 2. Salida de vehículos");
        System.out.println(" 0. Salir");
    }

    private static void menuEntradaVehiculo(){
        Scanner teclado = new Scanner(System.in);
        int opcionI = teclado.nextInt();
        if (opcionI == 1){
            if (motos < plazasMotos) {
                motos++;
                System.out.println("Ha añadido 1 moto, ahora hay " + motos + " en el parking");
            } else {
                System.out.println("El parking de motos está COMPLETO");
            }
        } else if (opcionI == 2){
            if (turismos < plazasMotos) {
                turismos++;
                System.out.println("Ha añadido 1 turismo, ahora hay " + turismos + " en el parking");
            } else {
                System.out.println("El parking de turismos está COMPLETO");
            }
        } else if (opcionI == 3){
            if (camiones < plazasMotos) {
                camiones++;
                System.out.println("Ha añadido 1 camión, ahora hay " + camiones + " en el parking");
            } else {
                System.out.println("El parking de camiones está COMPLETO");
            }
        } else {
            System.out.println("Opcioón no válida!");
        }
    }


    private static void menuSalidaVehiculo(){
        Scanner teclado = new Scanner(System.in);
        int opcionO = teclado.nextInt();
        if (opcionO == 1){
            motos--;
            System.out.println("Ha eliminado 1 moto, ahora hay " + motos + " en el parking");
        } else if (opcionO == 2){
            turismos--;
            System.out.println("Ha eliminado 1 turismo, ahora hay " + turismos + " en el parking");
        } else if (opcionO == 3){
            camiones--;
            System.out.println("Ha eliminado 1 camión, ahora hay " + camiones + " en el parking");
        } else {
            System.out.println("Opcioón no válida!");
        }
    }
    public static void main(String[] args) {
        do {
            // Inicialmente habrá 7 motos, 25 turismos y 2 camiones
            parkingInicial();

            // Creamos el menú opciones
            System.out.print("\nEscoja una opción: ");
            Scanner teclado = new Scanner(System.in);
            opcionIO = teclado.nextInt();

            switch (opcionIO){
                case 0:
                    System.out.println("Saliendo del menú...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("\n¿Qué vehículo desea añadir?");
                    System.out.println(" 1. Moto");
                    System.out.println(" 2. Turismo");
                    System.out.println(" 3. Camión");
                    System.out.print("\nOpción: ");
                    menuEntradaVehiculo();
                    break;
                case 2:
                    System.out.println("\n¿Qué vehículo desea eliminar?");
                    System.out.println(" 1. Moto");
                    System.out.println(" 2. Turismo");
                    System.out.println(" 3. Camión");
                    menuSalidaVehiculo();
                    break;
                default:
                    System.out.println("Opción no válida!");
            }

        } while (true);
    }
}
