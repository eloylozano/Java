package com.liceolapaz.des.elb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir un número al usuario
        pedirNumero();
        // Leer el número y guardarlo
        int numeroUsuario = leerNumero();
        // Comprobar si es par o impar y guardar mensaje
        String mensaje = comprobarNumero(numeroUsuario);
        // Escribir el mensaje
        escribirMensaje(mensaje);
    }

       private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumero() {
        System.out.print("Escriba un número entero: ");
    }

    private static String comprobarNumero(int numeroUsuario) {
        String mensaje = (numeroUsuario == 0) ?
                "EL número 0 es un rarito" :
                (numeroUsuario % 2 ==0) ?
                "El número es par" : "El numero es impar";
        return mensaje;
    }

    private static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}