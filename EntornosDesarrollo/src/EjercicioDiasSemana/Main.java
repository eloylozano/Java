package EjercicioDiasSemana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diaNumero;

        do {
            System.out.print("Introduce un número del 1 al 7 para saber el día de la semana: ");
            diaNumero = teclado.nextInt();

            if (diaNumero < 1 || diaNumero > 7) {
                System.out.println("Introduce un día válido");
            } else {
                String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
                System.out.println("El día " + diaNumero + " corresponde con el día " + diasSemana[diaNumero - 1]);
            }
        } while (diaNumero < 1 || diaNumero > 7);
    }
}