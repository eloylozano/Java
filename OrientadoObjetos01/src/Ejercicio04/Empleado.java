package Ejercicio04;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private int salario;

    // Primer constructor que recibe e inicializa el DNI
    public Empleado(String dni) {
        this.dni = dni;
    }

    // Segundo constructor que recibe DNI y Nombre
    public Empleado(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    // Constructor completo con todos los atributos
    public Empleado(String dni, String nombre, String apellidos, int salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

    // Método para calcular el salario neto
    public float calcularSalarioNeto() {
        return salario - (salario * 0.12f);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
