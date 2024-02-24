package Ejercicio07;


public class Main {
    public static void main(String[] args) {
        // Crear 5 objetos jugadores
        Jugador jugador1 = new Jugador("Juan", "Pérez", 10, 15.5);
        Jugador jugador2 = new Jugador("Pedro", "García", 23, 18.2);
        Jugador jugador3 = new Jugador("Ana", "López", 7, 12.8);
        Jugador jugador4 = new Jugador("María", "Martínez", 31, 14.3);
        Jugador jugador5 = new Jugador("Carlos", "Sánchez", 55, 16.9);

        // Crear un equipo
        Equipo_baloncesto equipo = new Equipo_baloncesto("Los Halcones");

        // Asignar jugadores al equipo
        equipo.setJugador(0, jugador1);
        equipo.setJugador(1, jugador2);
        equipo.setJugador(2, jugador3);
        equipo.setJugador(3, jugador4);
        equipo.setJugador(4, jugador5);

        // Mostrar datos del equipo y sus jugadores
        equipo.ver_datos();

    }
}