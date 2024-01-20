package Ejercicio03;

public class Main {
    public static void main(String[] args) {
        // Crear un rectángulo con base 7.5 y altura 4.6
        Rectangulo miRectangulo = new Rectangulo(7.5f, 4.6f);

        // Calcular y mostrar el perímetro
        float perimetro = miRectangulo.calcularPerimetro();
        System.out.println("El perímetro del rectángulo es: " + perimetro + " cm");

        // Calcular y mostrar el área
        float area = miRectangulo.calcularArea();
        System.out.println("El área del rectángulo es: " + area + " cm²");
    }
}