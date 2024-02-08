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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas > 0){
            this.numeroPaginas = numeroPaginas;
        } else {
            System.out.println("Error: El número de páginas debe ser positivo.");
        }
    }

    public void ver_datos(){
        System.out.println("El libro de " + autor.getNombre() + " " + autor.getApellido() + " llamado " + titulo + " con ISBN: " + ISBN + " tiene " + numeroPaginas + " páginas" );
    }
}
