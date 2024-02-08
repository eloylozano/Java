package Ejercicio05;

public class Main {
    public static void main(String[] args) {
        Artista artista01 = new Artista("Shakira", "Colombia", 1997);

        Disco discoArtista01 = new Disco("Sale el sol", artista01, 2009 ,15);

        artista01.ver_datos();

        discoArtista01.ver_datos();
    }
}
