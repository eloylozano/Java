package des.liceolapaz.org.elb;

import java.util.Scanner;

public class Principal1 {
    private static void menu() {
        System.out.println("\nCALCULADORA");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Producto");
        System.out.println("4. División");
        System.out.println("0. Salir");
    }

    private static void pedirOpcion() {
        System.out.print("Escribe una opción: ");
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOperando1() {
        System.out.print("Escriba el primer operando: ");
    }

    private static Double leerOperando1() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirOperando2() {
        System.out.print("Escriba el segundo operando: ");
    }

    private static double leerOperando2(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void escribirResultado(double primerOperando, double segundoOperando, int opcion){
        double resultado = 0;
        switch (opcion){
            //Suma
            case 1:
                resultado = primerOperando + segundoOperando;
                break;
            //Resta
            case 2:
                resultado = primerOperando - segundoOperando;
                break;
            //Producto
            case 3:
                resultado = primerOperando * segundoOperando;
                break;
            //División
            case 4:
                resultado = primerOperando / segundoOperando;
                break;
        }
        System.out.println("El resultado de la operación es: " + resultado);
    }
    //------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        do {
            //Escribir menú
            menu();
            //Pedir opción
            pedirOpcion();
            //Leer opción y guardarla
            int opcion = leerOpcion();
            //Si la opción es 0
            if (opcion == 0) {
                System.exit(0);
            }
            //Si la opción es 1 o 2 o 3 o 4 entonces:
            else if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                //Pedir el primer operando
                pedirOperando1();
                //Leer el primer operando y guardarlo
                double primerOperando = leerOperando1();
                //Pedir el segundo operando y guardarlo
                pedirOperando2();
                //Leer el segundo operando y guardarlo
                double segundoOperando = leerOperando2();
                //Escribir el resultado
                escribirResultado(primerOperando, segundoOperando, opcion);
            }
            //Si la opción no existe entonces:
            else {
                //Mostrar mensaje de error
                System.out.println("Opción no válida");
            }
        } while (true);

    }


}
