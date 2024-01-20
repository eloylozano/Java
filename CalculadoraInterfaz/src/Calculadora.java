import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú principal
            System.out.println("CALCULADORA");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Escoja una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    realizarOperacion(opcion);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 0);
    }

    private static void realizarOperacion(int operacion) {
        Scanner scanner = new Scanner(System.in);
        int tipoNumeros;

        System.out.println("Tipo de números");
        System.out.println("1. Números enteros");
        System.out.println("2. Números racionales");
        System.out.println("3. Números complejos");
        System.out.println("0. Cancelar");
        System.out.print("Escoja una opción: ");
        tipoNumeros = scanner.nextInt();

        switch (tipoNumeros) {
            case 1:
                Enteros entero1 = obtenerEntero("primer");
                Enteros entero2 = obtenerEntero("segundo");
                realizarOperacionConEnteros(operacion, entero1, entero2);
                break;
            case 2:
                Racionales racional1 = obtenerRacional("primer");
                Racionales racional2 = obtenerRacional("segundo");
                realizarOperacionConRacionales(operacion, racional1, racional2);
                break;
            case 3:
                Complejos complejo1 = obtenerComplejo("primer");
                Complejos complejo2 = obtenerComplejo("segundo");
                realizarOperacionConComplejos(operacion, complejo1, complejo2);
                break;
            case 0:
                System.out.println("Operación cancelada. Volviendo al menú principal.");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                realizarOperacion(operacion);
                break;
        }
    }

    private static Enteros obtenerEntero(String orden) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el valor del " + orden + " operando: ");
        int valor = scanner.nextInt();
        return new Enteros(valor);
    }

    private static Racionales obtenerRacional(String orden) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el numerador del " + orden + " operando: ");
        int numerador = scanner.nextInt();
        System.out.print("Escriba el denominador del " + orden + " operando: ");
        int denominador = scanner.nextInt();
        return new Racionales(numerador, denominador);
    }

    private static Complejos obtenerComplejo(String orden) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba la parte real del " + orden + " operando: ");
        double parteReal = scanner.nextDouble();
        System.out.print("Escriba la parte imaginaria del " + orden + " operando: ");
        double parteImaginaria = scanner.nextDouble();
        return new Complejos(parteReal, parteImaginaria);
    }

    private static void realizarOperacionConEnteros(int operacion, Enteros operando1, Enteros operando2) {
        // Lógica para operaciones con números enteros
        // ...
    }

    private static void realizarOperacionConRacionales(int operacion, Racionales operando1, Racionales operando2) {
        // Lógica para operaciones con números racionales
        // ...
    }

    private static void realizarOperacionConComplejos(int operacion, Complejos operando1, Complejos operando2) {
        // Lógica para operaciones con números complejos
        // ...
    }
}
