package Ejercicio04;

public class Main {
    public static void main(String[] args) {
        Empleado empleado01 = new Empleado("12789671W", "Pepe", "Rodriguez", 1200);

        // Llamada al método para mostrar el salario neto
        System.out.println("Salario neto de " + empleado01.getNombre() + ": " + empleado01.calcularSalarioNeto());
    }
}
