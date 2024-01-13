package Ejercicio05;

public class Main {
    public static void main(String[] args) {
        NotasAlumno alumno01 = new NotasAlumno("Lenguajes de Marca", "Andrés", "Vieites Rodriguez", 6, 7.5, 8.6);

        System.out.println("Asignatura: " + alumno01.getAsignatura());
        System.out.println("Nombre: " + alumno01.getNombre());
        System.out.println("Apellidos: " + alumno01.getApellidos());
        System.out.println("Nota Evaluación 1: " + alumno01.getNota_eval1());
        System.out.println("Nota Evaluación 2: " + alumno01.getNota_eval2());
        System.out.println("Nota Evaluación 3: " + alumno01.getNota_eval3());
        System.out.println("Media de Notas: " + alumno01.media());
    }


}
