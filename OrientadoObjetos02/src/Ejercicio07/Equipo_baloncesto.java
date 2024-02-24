package Ejercicio07;

import java.util.Date;

class Equipo_baloncesto {
    private String nombre;
    private Date fechaFundacion;
    private Jugador[] jugadores = new Jugador[5];

    public Equipo_baloncesto(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        if (fechaFundacion.before(new Date())) {
            this.fechaFundacion = fechaFundacion;
        } else {
            System.out.println("La fecha de fundación debe ser anterior a la fecha actual.");
        }
    }

    public void setJugador(int indice, Jugador jugador) {
        if (indice >= 0 && indice < 5) {
            jugadores[indice] = jugador;
        } else {
            System.out.println("El índice debe estar entre 0 y 4.");
        }
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void ver_datos() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Fecha de fundación: " + fechaFundacion);
        System.out.println("Jugadores:");
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                System.out.println("Jugador " + (i + 1) + ":");
                jugadores[i].ver_datos();
            }

        }
    }

    public Jugador maximo_anotador() {
        double maxMedia = -1;
        Jugador maxJugador = null;
        for (Jugador jugador : jugadores) {
            if (jugador != null && jugador.getMediaPuntosPorPartido() > maxMedia) {
                maxMedia = jugador.getMediaPuntosPorPartido();
                maxJugador = jugador;
            }
        }
        return maxJugador;
    }
}