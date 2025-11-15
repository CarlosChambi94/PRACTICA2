package EXCEPCIONES.EJERCICIO6;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345" , "Juan Pérez ", 1000);
        try{
            cuenta.depositar(130);
            cuenta.depositar(-11);

        } catch (FondosInsuficientesException e ){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            cuenta.retirar(100);
            cuenta.retirar(1200);
        } catch (FondosInsuficientesException e){
            System.out.println("Error: " + e.getMessage());
        }
        cuenta.mostrarInfo();
    }
}
