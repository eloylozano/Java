package Ejercicio05;

import java.text.DecimalFormat;

public class NotasAlumno {
    private String asignatura;
    private String nombre;
    private String apellidos;
    private double nota_eval1;
    private double nota_eval2;
    private double nota_eval3;

    // Constructor
    public NotasAlumno(String asignatura, String nombre, String apellidos, double nota_eval1, double nota_eval2, double nota_eval3) {
        this.asignatura = asignatura;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota_eval1 = nota_eval1;
        this.nota_eval2 = nota_eval2;
        this.nota_eval3 = nota_eval3;
    }

    // Método para calcular la media de las notas
    public double media() {
        return (nota_eval1 + nota_eval2 + nota_eval3) / 3;
    }

    // Método para mostrar todos los datos del alumno
    public void mostrarDatos() {
        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.println("Asignatura: " + asignatura);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nota Evaluación 1: " + formato.format(nota_eval1));
        System.out.println("Nota Evaluación 2: " + formato.format(nota_eval2));
        System.out.println("Nota Evaluación 3: " + formato.format(nota_eval3));
        System.out.println("Media de notas: " + formato.format(media()));
    }
}
