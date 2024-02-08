import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
    do {
        mostrarmenu();
        int opcion = leerOpcion();
        double cantidadSolicitada = 0;
        double cantidadEnEuros = 0;
        switch(opcion) {
            case 0:
                System.out.println("Saliendo...");
                System.exit(0);
                break;

            case 1:
                cantidadSolicitada = pedirCantidad();
                Dolar dolarAConvertir = new Dolar(cantidadSolicitada); //Creo objeto "dolar" con atributo "cantidadSolicitada".
                cantidadEnEuros = dolarAConvertir.cantidadEnEuros(); //Usamos el método "cantidadEnEuros" para convertir a dolar el objeto "dolarAConvertir" y almacenarlo en la variable cantidadEnEuros.
                mostrarResultado(cantidadEnEuros); // La función "mostrarResultado nos da el resultado del parámetro "cantidadEnEuros".
                //System.out.println(mostrarResultado(cantidadEnEuros));  //Otra forma de hacerlo.
                break;

            case 2:
                cantidadSolicitada = pedirCantidad();
                Libra libraAConvertir = new Libra(cantidadSolicitada);
                cantidadEnEuros = libraAConvertir.cantidadEnEuros();
                mostrarResultado(cantidadEnEuros);
                //System.out.println(mostrarResultado(cantidadEnEuros));  //Otra forma de hacerlo.
                break;

            case 3:
                cantidadSolicitada = pedirCantidad();
                Yen yenAConvertir = new Yen(cantidadSolicitada);
                cantidadEnEuros = yenAConvertir.cantidadEnEuros();
                mostrarResultado(cantidadEnEuros);
                //System.out.println(mostrarResultado(cantidadEnEuros));   //Otra forma de hacerlo.
                break;


            default:
                System.out.println("OPCION NO VALIDA");
        }

    } while (true);

}

    private static int leerOpcion() {
        int opcion = 0; //Iniciamos opcion a 0.
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();
        return opcion;
    }


    private  static void mostrarResultado(double cantidadEnEuros){
        System.out.println("La cantidad en euros es: " + cantidadEnEuros);
    }
    /*
    private static String mostrarResultado(double cantidadEnEuros){
    return "La cantidad en euros es: " + cantidadEnEuros;
    }*/   //Otra forma de hacerlo.

    private static double pedirCantidad() {
        System.out.println("Escriba la cantidad: ");
        double cantidad = 0; // Iniciamos cantidad a 0.
        Scanner teclado = new Scanner(System.in);
        cantidad = teclado.nextDouble();
        return cantidad;
    }

    private static void mostrarmenu() {
        System.out.println("CONVERSOR DE MONEDAS\n" +
                "1. Dólares\n" +
                "2. Libras\n" +
                "3. Yens\n" +
                "0. Salir\n" +
                "Escoja una opción: ");
    }
}


/*
opcion 1: double cantidad = teclado.nextDouble
Dolar d = new Dolar(cantidad);
double valor = d.cantidadEnEuros();
System.out.println(valor);
 */