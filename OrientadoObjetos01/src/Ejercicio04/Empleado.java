package Ejercicio04;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int salario;

    // Constructor con DNI y Nombre
    public Empleado(String dni, String nombre, String apellido, int salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    // Método para calcular el salario neto
    public float calcularSalarioNeto() {
        return salario - (salario * 0.12f);
    }

    // Getters para acceder a los atributos privados
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSalario() {
        return salario;
    }
}
