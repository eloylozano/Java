import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        CuentaBancaria nuevaCuenta = null;
        Scanner teclado = new Scanner(System.in);
        do {
            menu();
            int opcion = teclado.nextInt();

            switch (opcion) {
                default:
                    System.out.println("Opción no válida!");
                    break;
                case 1:
                    subMenu();
                    int opcionSubMenu = teclado.nextInt();

                    switch (opcionSubMenu) {
                        case 1:
                            System.out.print("Intrduzca su saldo inicial: ");
                            double saldoCuentaNormal = teclado.nextDouble();
                            nuevaCuenta = new CuentaNormal(saldoCuentaNormal);
                            break;
                        case 2:
                            System.out.print("Intrduzca su saldo inicial: ");
                            double saldoCuentaPremium = teclado.nextDouble();
                            nuevaCuenta = new CuentaNormal(saldoCuentaPremium);
                            break;
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("Opción no válida!");
                    }
                    break;
                case 2, 3:
                    if (nuevaCuenta == null) {
                        System.out.println("No tiene una cuenta creada");
                    } else {
                        System.out.print("Intrduzca una cantnidad: ");
                        double cantidad = teclado.nextDouble();
                        if (opcion == 3) {
                            nuevaCuenta.retirarDinero(cantidad);
                        } else {
                            nuevaCuenta.ingresarDinero(cantidad);
                        }
                    }
                    break;
                case 4:
                    if (nuevaCuenta != null) {
                        System.out.println("Su saldo es de: " + nuevaCuenta.consultarsaldo() + " €");
                    } else {
                        System.out.println("No tiene una cuenta creada");
                    }
                    break;
            }
        } while (true);
    }

    private static void subMenu() {
        System.out.println("""
                \nTipo de cuenta
                  1. Cuenta normal
                  2. Cuenta Premium
                  0. Cancelar
                """);
        System.out.print("Escoja una opción: ");
    }

    private static void menu() {
        System.out.println("""
                \nBANCO
                 1. Crear Cuenta
                 2. Ingresar dinero
                 3. Retirar dinero
                 4. Consultar saldo
                 0. Salir
                """);
        System.out.print("Escoja una opción: ");
    }
}
