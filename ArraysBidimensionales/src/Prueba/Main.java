package Prueba;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = new int[3][5];
        /* Inicializamos el array realizando un recorrido por filas */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = i * 5 + j + 1;
            }
        }
        System.out.println("Recorrido por filas: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Recorrido por columnas: "); // invertimos los for
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.println(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}