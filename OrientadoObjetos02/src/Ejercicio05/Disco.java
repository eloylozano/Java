package Ejercicio05;

public class Disco {
    private String titulo;
    private  Artista artista;
    private int anhoLanzamiento;
    private int numeroCanciones;

    public Disco(String titulo, Artista artista, int anhoLanzamiento, int numeroCanciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.anhoLanzamiento = anhoLanzamiento;
        this.numeroCanciones = numeroCanciones;
    }

    public int antiguedad(){
        return 2024 - anhoLanzamiento;
    }

    public void ver_datos(){
        System.out.println("El disco " + titulo + " de " + artista.getNombre() + " se lanzó en " + anhoLanzamiento + " con " + numeroCanciones + " canciones.");
    }
}
