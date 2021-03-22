package Ejercicio1;

public class CuentaCorriente {
    private double saldo;
    private int nroDeCuenta;
    private static int contador = 0;

    public CuentaCorriente(){
        saldo = 0;
        nroDeCuenta = contador;
        contador ++;
    }
    public CuentaCorriente(double saldo , int  nroDeCuenta ){
        this.saldo = saldo;
        this.nroDeCuenta = nroDeCuenta;
    }
    public CuentaCorriente(CuentaCorriente cuenta ){
        this.saldo = cuenta.saldo;
        this.nroDeCuenta = cuenta.nroDeCuenta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void ingreso(double importe){
        saldo += importe;
    }
    public void egreso(double importe){
        saldo -= importe;
    }
    public void reintegro(double importe){
        this.ingreso(importe);
    }
    public void transferencia(CuentaCorriente cuenta, double importe){
        cuenta.ingreso(importe);
        this.egreso(importe);
    }
}
