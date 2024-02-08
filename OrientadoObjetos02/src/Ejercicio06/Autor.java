package Ejercicio06;

public class Autor {
    private String nombre;
    private String apellido;
    private int anhoNacimiento;
    private String pais;

    public Autor(String nombre, String apellido, int anhoNacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        setAnhoNacimiento(anhoNacimiento);
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnhoNacimiento() {
        return anhoNacimiento;
    }

    public void setAnhoNacimiento(int anhoNacimiento) {
        if (anhoNacimiento <= 2024) {
            this.anhoNacimiento = anhoNacimiento;
        } else {
            System.out.println("Error: El año de nacimiento no puede ser superior al año actual.");
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void ver_datos(){
        System.out.println("El autor " + nombre + " " + apellido + " nació en " + pais + " en el " + anhoNacimiento) ;
    }

    public int edad() {
        return 2024 - anhoNacimiento;
    }
}
