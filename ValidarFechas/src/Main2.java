import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una fecha en formato dd/mm/aaaa: ");
        String fecha = teclado.nextLine();

        // Dividir la fecha en día, mes y año
        String[] componentes = fecha.split("/");
        if (componentes.length == 3) {
            int dia = Integer.parseInt(componentes[0]);
            int mes = Integer.parseInt(componentes[1]);
            int anho = Integer.parseInt(componentes[2]);

            String mensaje = validarFecha(dia, mes, anho);
            System.out.println(mensaje);
        } else {
            System.out.println("Formato de fecha incorrecto. Use dd/mm/aaaa.");
        }
    }

    private static String validarFecha(int dia, int mes, int anho) {
        String mensaje = "La fecha es correcta";
        String[] arrayMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] arrayDiasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (dia < 1 || dia > 31) {
            mensaje = "No puede un mes tener más de 31 días";
        } else if (mes < 1 || mes > 12) {
            mensaje = "No puede un año tener más de 12 meses";
        } else if (anho == 0) {
            mensaje = "No existe el año 0";
        } else if (mes == 2 && (dia > 29 || (dia == 29 && !validarBisiesto(anho)))) {
            mensaje = "El mes de " + arrayMes[mes - 1] + " no puede tener " + dia + " días";
        } else if (dia > arrayDiasPorMes[mes - 1] + (mes == 2 && validarBisiesto(anho) ? 1 : 0)) {
            mensaje = "El mes de " + arrayMes[mes - 1] + " no puede tener " + dia + " días";
        }
        return mensaje;
    }

    private static boolean validarBisiesto(int anho) {
        return anho % 4 == 0 && (!(anho % 100 == 0) || (anho % 400 == 0));
    }
}