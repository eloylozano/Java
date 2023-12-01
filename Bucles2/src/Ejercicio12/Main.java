package Ejercicio12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int aleatorio = 0;
        int contadorIntentos = 0;
        int respuesta = 0;


        while (true) {
            aleatorio = (int) (Math.random() * 10) + 1;
            contadorIntentos = 1;

            while (respuesta != aleatorio) {
                System.out.print("Escriba el numero: ");
                respuesta = entrada.nextInt();

                if (respuesta > aleatorio) {
                    System.out.println("El número a adivinar es menor");
                } else if (aleatorio > respuesta) {
                    System.out.println("El número a adivinar es mayor");
                } else {
                    System.out.println("Has acertado el número en " + contadorIntentos + " intentos");
                    System.exit(0);
                }
                contadorIntentos++;
            }
        }
    }
}
