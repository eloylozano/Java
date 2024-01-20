class Racionales extends Numeros {
    private int numerador;
    private int denominador;

    public Racionales(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
}