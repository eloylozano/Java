package Ejercicio06;

public class Main {
    public static void main(String[] args) {
        Autor autor01 = new Autor("Carlos", "Ruiz Zafón", 1964, "España");

        Libro libroAutor01 = new Libro(autor01, "9788408105824", "El prisionero del Cielo", 140);

        autor01.ver_datos();
        libroAutor01.ver_datos();
    }
}
