import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un día: ");
        int dia = teclado.nextInt();
        System.out.print("Introduce un mes: ");
        int mes = teclado.nextInt();
        System.out.print("Introduce un año: ");
        int anho = teclado.nextInt();

        String mensaje = validarFecha(dia, mes, anho);

        System.out.println(mensaje);
    }

    private static String validarFecha(int dia, int mes, int anho) {
        String mensaje = "La fecha es válida";
        String[] arrayMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] arrayDiasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        if (dia < 1 || dia > 31) {
            mensaje = "Tiene que estar entre 1 y 31 días";
        } else if (mes < 1 || mes > 12) {
            mensaje = "Un año tiene solo 12 meses";
        } else if (anho == 0) {
            mensaje = "No existe el año 0";
        } else if (dia == 29 && mes == 2) {
            boolean anhoBisiesto = validarBisiesto(anho);
            if (!anhoBisiesto) {
                mensaje = "El año " + anho + " no es bisiesto.";
            }
        } else if (dia > arrayDiasPorMes[mes - 1]) {
            mensaje = "El mes de " + arrayMes[mes - 1] + " no puede tener " + dia + " días";
        }
        return mensaje;
    }

    private static boolean validarBisiesto(int anho) {
        return anho % 4 == 0 && (!(anho % 100 == 0) || (anho % 400 == 0));
    }
}