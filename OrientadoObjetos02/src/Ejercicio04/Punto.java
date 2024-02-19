package Ejercicio04;

class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(int unidades) {
        x += unidades;
    }

    public void desplazaY(int unidades) {
        y += unidades;
    }
}