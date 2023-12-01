import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int numero = teclado.nextInt();

        System.out.print("Escribe el número de repeticiones: ");
        int repeticiones = teclado.nextInt();

        if (numero % 2 == 1){
            for (int i = 0; i < repeticiones; i++) {
                System.out.println(numero - 2);
                numero -= 2;
            }

        }else{
            for (int i = 0; i < repeticiones; i++) {
                System.out.println(numero - 2);
                numero -= 2;
            }
        }
    }
}
