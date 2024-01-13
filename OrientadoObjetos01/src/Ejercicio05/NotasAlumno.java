package Ejercicio05;

public class NotasAlumno {
    private String asignatura;
    private String nombre;
    private String apellidos;
    private double nota_eval1;
    private double nota_eval2;
    private double nota_eval3;


    public NotasAlumno(String asignatura, String nombre, String apellidos, double nota_eval1, double nota_eval2, double nota_eval3) {
        this.asignatura = asignatura;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota_eval1 = nota_eval1;
        this.nota_eval2 = nota_eval2;
        this.nota_eval3 = nota_eval3;
    }


    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getNota_eval1() {
        return nota_eval1;
    }

    public void setNota_eval1(double nota_eval1) {
        this.nota_eval1 = nota_eval1;
    }

    public double getNota_eval2() {
        return nota_eval2;
    }

    public void setNota_eval2(double nota_eval2) {
        this.nota_eval2 = nota_eval2;
    }

    public double getNota_eval3() {
        return nota_eval3;
    }

    public void setNota_eval3(double nota_eval3) {
        this.nota_eval3 = nota_eval3;
    }
public double media(){
        return  (nota_eval1 + nota_eval2 + nota_eval3 )/3;
}

}
