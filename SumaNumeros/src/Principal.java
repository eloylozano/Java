import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Pedir números al usuario
        pedirNumeros ();
        // Leer números y guardarlos
        int [] numeros = new int [10];
        int contador = 0;
        do {
            // Leer número y guardarlo
            numeros[contador] = leerNumero();
            // Sumar uno al contador
            contador++;
        } while (contador < 10);
        // Sumar números y guardar resultado
        int resultado = sumarNumeros(numeros);
        // Escribir resultado
        escribirResultado(resultado);
    }

    private static void escribirResultado(int resultado){
        System.out.println("la suma de los números es: " + resultado);
    }
    private static int sumarNumeros(int[] numeros) {
        int resultado = 0;
        for (int posicion = 0; posicion < numeros.length; posicion++) {
            resultado = resultado + numeros[posicion];
        }
        return resultado;
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeros() {
        System.out.println("Escriba 10 números enteros");
    }

}
