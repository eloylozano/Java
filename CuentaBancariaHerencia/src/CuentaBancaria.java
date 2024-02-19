public abstract class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad <= 0){
            System.out.println("La cantidad debe ser positiva");
        } else {
            saldo += cantidad;
        }
    }

    public void retirarDinero(double cantidad){
        if (cantidad <= 0){
            System.out.println("La cantidad debe ser positiva");
        } else {
            saldo -= cantidad;
        }
    }
    public  double consultarsaldo(){
        return saldo;
    }


}
