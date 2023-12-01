package com.liceolapaz.des.elb;

import java.util.Scanner;

public class Principal {
    private static final int SIN_CUENTA = 0;
    private static final int CUENTA_NORMAL = 1;
    private static final int CUENTA_PREMIUM = 2;

    private static int tipoCuenta = SIN_CUENTA;
    private static double saldoCuenta = 0;
    private static void escribirMenuPrincipal() {
        System.out.println("\nBANCO");
        System.out.println("1. Crear cuenta");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Consultar saldo");
        System.out.println("0. Salir");
    }

    private static void pedirOpcion(){
        System.out.print("Escoja una opción: ");
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void escribirSubmenu(){
        System.out.println("\nTipo de cuenta");
        System.out.println("1. Crear cuenta");
        System.out.println("2. Ingresar dinero");
        System.out.println("0. Cancelar");
    }

    private static void pedirSaldoInicial(){
        System.out.print("Escriba el saldo inicial: ");
    }

    private static double leerDouble(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void crearCuenta(int tipo) {
        // Pedir saldo inicial
        pedirSaldoInicial();
        // Leer saldo y almacenarlo
        saldoCuenta = leerDouble();
        // Si el el saldo es negativo
        if (saldoCuenta < 0) {
            // Mostrar error
            System.out.println("El saldo inicial no puede ser negativo");
            // Resetear el saldo
            saldoCuenta = 0;
            // Resetear tipo de cuenta
            tipoCuenta = SIN_CUENTA;
            // Salir del método
            return;
        }
        // Establecer tipo cuenta normal
        tipoCuenta = tipo;
    }

    private static void pedirCantidad() {
        System.out.print("Escriba la cantidad: ");
    }

    private static void mostrarSaldo() {
        // Si hay cuenta activa
        if (tipoCuenta != SIN_CUENTA) {
            // Escribir saldo
            System.out.println("El saldo de la cuenta es " + String.format("%.2f", saldoCuenta) + " €");
        }
        // Si no hay
        else {
            // Mostrar error
            System.out.println("No hay cuenta activa");
        }
    }

    private static void ingresarDinero() {
        // Pedir cantidad
        pedirCantidad();
        // Leer cantidad y almacenarla
        double cantidad = leerDouble();
        // Si la cantidad es positiva
        if (cantidad > 0) {
            // Sumar cantidad al saldo
            saldoCuenta += cantidad;
            // Mostrar saldo
            mostrarSaldo();
        }
        // Si no lo es
        else {
            // Mostrar error
            System.out.println("La cantidad a ingresar debe ser positiva");
        }
    }

    private static void retirarDinero() {
        // Pedir cantidad
        pedirCantidad();
        // Leer cantidad y almacenarla
        double cantidad = leerDouble();
        // Si la cantidad es positiva
        if (cantidad > 0) {
            // Si es cuenta normal y no hay suficiente saldo
            if (tipoCuenta == CUENTA_NORMAL && saldoCuenta < cantidad) {
                // Mostrar mensaje de error
                System.out.println("Las cuentas normales no pueden tener saldo negativo");
            }
            // En otro caso
            else {
                // Restar cantidad al saldo
                saldoCuenta -= cantidad;
                // Mostrar saldo
                mostrarSaldo();
            }
        }
        // Si no lo es
        else {
            // Mostrar error
            System.out.println("La cantidad a retirar debe ser positiva");
        }
    }


    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        do {
            escribirMenuPrincipal();
            pedirOpcion();
            int opcion = leerOpcion();
            switch (opcion){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    escribirSubmenu();
                    pedirOpcion();
                    int opcion2 = leerOpcion();
                    if (opcion2 == 1) {
                        crearCuenta(CUENTA_NORMAL);
                    } else if (opcion == 2){
                        crearCuenta(CUENTA_PREMIUM);
                    } else if (opcion2 == 0) {
                    } else {
                        System.out.println("Opción no válida");
                    }
                    break;
                case 2:
                    ingresarDinero();
                    break;
                case 3:
                    retirarDinero();
                    break;
                case 4:
                    mostrarSaldo();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (true);
    }
}
