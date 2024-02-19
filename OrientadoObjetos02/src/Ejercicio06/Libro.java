package Ejercicio06;

public class Libro {
    private Autor autor;
    private String ISBN;
    private String titulo;
    private int numeroPaginas = 0;

    public Libro(Autor autor, String ISBN, String titulo, int numeroPaginas) {
        this.autor = autor;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public void ver_datos(){
        System.out.println("El libro de " + autor.getNombre() + " " + autor.getApellido() + " llamado " + titulo + " con ISBN: " + ISBN + " tiene " + numeroPaginas + " páginas" );
    }
}
