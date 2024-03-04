import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        do {
            menu();
            System.out.print("\nEscoja una opción: ");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 0:
                    System.exit(0);
                case 1: { // Triangulo
                    System.out.print("Escriba la base: ");
                    double base = teclado.nextDouble();
                    System.out.print("Escriba la lado 2: ");
                    double lado2 = teclado.nextDouble();
                    System.out.print("Escriba el lado 3: ");
                    double lado3 = teclado.nextDouble();
                    System.out.print("Escriba la altura: ");
                    double altura = teclado.nextDouble();
                    Triangulo triangulo = new Triangulo(base, lado2, lado3, altura);

                    System.out.println("Como resultado da: area " + triangulo.calcularArea() + " perímetro " + triangulo.calcularPerimetro());
                    break;
                }
                case 2: { // Rectángulo
                    System.out.print("Escriba la base: ");
                    double base = teclado.nextDouble();
                    System.out.print("Escriba la base: ");
                    double altura = teclado.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(base, altura);

                    System.out.println("Como resultado da: area " + rectangulo.calcularArea() + " perímetro " + rectangulo.calcularPerimetro());
                    break;
                }
                case 3: { // Cuadrado
                    System.out.print("Escriba el lado: ");
                    double lado = teclado.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    System.out.println("Como resultado da: area " + cuadrado.calcularArea() + " perímetro " + cuadrado.calcularPerimetro());
                    break;
                }
                case 4: { // Pentagono
                    System.out.print("Escriba el lado: ");
                    double lado = teclado.nextDouble();
                    System.out.print("Escriba la apotema: ");
                    double apotema = teclado.nextDouble();
                    Pentagono pentagono = new Pentagono(lado, apotema);

                    System.out.println("Como resultado da: area " + pentagono.calcularArea() + " perímetro " + pentagono.calcularPerimetro());
                    break;
                }
                default:
                    System.out.println("Opción no válida! ");
            }
        } while (true);
    }
    // ---------------------------------------------------------------------------------------------
    private static void menu() {
        System.out.println("""
                FIGURAS GEOMÉTRICAS
                1. Triángulo
                2. Rectángulo
                3. Cuadrado
                4. Pentágono
                0. Salir """);
    }
}
