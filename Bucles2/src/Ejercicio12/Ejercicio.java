package Ejercicio12;
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int aleatorio = 0;
        int numeroIntentos = 0;
        int contadorIntentos = 0;
        int respuesta = 0;

        boolean fin = false;

        while (!fin) {
            aleatorio = (int) (Math.random() * 10) + 1;
            numeroIntentos = 3;
            contadorIntentos = 1;

            while (numeroIntentos > 0) {
                System.out.print("Escriba el numero: ");
                respuesta = entrada.nextInt();

                if (respuesta > aleatorio) {
                    System.out.println("El número a adivinar es menor");
                } else if (aleatorio > respuesta) {
                    System.out.println("El número a adivinar es mayor");
                } else {
                    System.out.println("Has acertado el número en " + contadorIntentos + " intentos");
                }

                contadorIntentos++;
                numeroIntentos--;

                if (numeroIntentos == 0) {
                    System.out.println("No ha acertado el número máximo de intentos. El número era " + aleatorio);
                }
            }
        }
        entrada.close();
    }
}
