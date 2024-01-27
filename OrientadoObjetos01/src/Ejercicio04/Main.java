package Ejercicio04;

public class Main {
    public static void main(String[] args) {
        // Crear objeto Empleado usando el primer constructor
        Empleado empleado01 = new Empleado("12789671W");
        empleado01.setNombre("Pepe");
        empleado01.setApellidos("Rodriguez");
        empleado01.setSalario(1200);

        // Crear objeto Empleado usando el segundo constructor
        Empleado empleado02 = new Empleado("12789671W", "Pepe");

        // Mostrar salario neto del primer empleado
        System.out.println("Salario neto de " + empleado01.getNombre() + ": " + empleado01.calcularSalarioNeto());

        // Mostrar salario neto del segundo empleado
        System.out.println("Salario neto de " + empleado02.getNombre() + ": " + empleado02.calcularSalarioNeto());
    }
}
