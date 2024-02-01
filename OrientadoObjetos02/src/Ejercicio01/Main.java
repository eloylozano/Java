package Ejercicio01;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una marca de Pendrive: ");
        String marcaIntroducida = teclado.nextLine();
        System.out.print("Introduce un modelo: ");
        String modeloIntroducido = teclado.nextLine();
        System.out.print("Introduce una capacidad: ");
        int capacidadIntroducida = teclado.nextInt();
        System.out.print("Introduce un precio: ");
        BigDecimal precioIntroducido = BigDecimal.valueOf(teclado.nextDouble());

        // Corrección: Pasa las variables correctas al crear el objeto Pendrive
        Pendrive usb1 = new Pendrive("marcaIntroducida", "modeloIntroducido", capacidadIntroducida, precioIntroducido);

        System.out.println("El precio con IVA es " + usb1.calcularPrecioConIVA());
    }
}