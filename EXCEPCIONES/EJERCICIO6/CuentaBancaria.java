package EXCEPCIONES.EJERCICIO6;

public class CuentaBancaria {
    private String numeroCuenta, titular;
    private double saldo ;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) throws FondosInsuficientesException{
        if(monto < 0 ){
            throw new FondosInsuficientesException("El monto es negativo");
        }
        setSaldo(monto);
    }

    public void retirar(double monto) throws FondosInsuficientesException{
        if(monto > saldo){
            throw new FondosInsuficientesException("Saldo insuficiente");
        }
        this.saldo -= monto;
    }

    public void mostrarInfo(){
        System.out.println("Numero de cuenta: " + numeroCuenta + " Titular; " + titular + " Saldo: " + saldo);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
}
