package Solución;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("""
                    \nCONVERSOR DE MONEDAS
                    1. Dólares
                    2. Libras
                    3. Yens
                    0. Salir
                    Escoja una opción: """);

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Escribe la cantidad: ");
                    double cantidad = teclado.nextDouble();

                    Moneda moneda;

                    if (opcion == 1){
                       moneda = new Dolar(cantidad);
                    } else if (opcion == 2) {
                        moneda = new Libra(cantidad);
                    } else{
                        moneda = new Yen(cantidad);
                    }

                    System.out.println("La cantidad en euros es: " + moneda.cantidadEnEuros() + " €");

                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("Escribe opción válida!");
                    break;
            }
        } while (true);
    }
}