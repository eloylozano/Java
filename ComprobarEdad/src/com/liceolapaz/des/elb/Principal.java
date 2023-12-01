package com.liceolapaz.des.elb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Preguntar el año de nacimiento
        pedirAnho();
        // Leer el año de nacimiento y guardarlo
        int anhoNacimiento = leerAnhoNacimiento();
        // Comprobar el año y guardar mensaje
        String mensaje = comprobarAnhoNacimiento(anhoNacimiento);
        // Escribir el mensaje
        escribirMensaje(mensaje);
    }

    private static void pedirAnho() {
        System.out.print("Escriba su año de nacimiento: ");
    }

    private static int leerAnhoNacimiento() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();

    }

    private static String comprobarAnhoNacimiento(int anhoNacimiento) {
        String mensaje;
        int edad = 2023 - anhoNacimiento;
        if (anhoNacimiento > 2023 ){
            mensaje = "No puedes haber nacido en el futuro";
        }else if (edad > 150) {
            mensaje = "No puedes tener tantos años";
        } else if (edad >= 18) {
            mensaje = "Tienes permiso para entrar";
        } else {
            mensaje = "No puedes pasar";
        }
        return mensaje;
    }

    private static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
