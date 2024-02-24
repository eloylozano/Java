package Ejercicio07;
import java.util.Date;

class Jugador {
    private String nombre;
    private String apellidos;
    private int dorsal;
    private double mediaPuntosPorPartido;

    public Jugador(String nombre, String apellidos, int dorsal, double mediaPuntosPorPartido) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        setDorsal(dorsal); // Validación del dorsal
        setMediaPuntosPorPartido(mediaPuntosPorPartido); // Validación de la media de puntos por partido
    }

    // Métodos getter y setter
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

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal >= 1 && dorsal <= 100) {
            this.dorsal = dorsal;
        } else {
            System.out.println("El dorsal debe estar entre 1 y 100.");
        }
    }

    public double getMediaPuntosPorPartido() {
        return mediaPuntosPorPartido;
    }

    public void setMediaPuntosPorPartido(double mediaPuntosPorPartido) {
        if (mediaPuntosPorPartido >= 0) {
            this.mediaPuntosPorPartido = mediaPuntosPorPartido;
        } else {
            System.out.println("La media de puntos por partido debe ser positiva.");
        }
    }

    public void ver_datos() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Media de puntos por partido: " + mediaPuntosPorPartido);
    }
}
