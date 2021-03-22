package Ejercicio1;

public class Banco {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente(100,21936264);
        CuentaCorriente cuenta2 = new CuentaCorriente(100,219364);

        System.out.println("cuenta1 " +  cuenta1.getSaldo());
        cuenta1.ingreso(789347);
        System.out.println("cuenta1 " + cuenta1.getSaldo());
        cuenta1.egreso(347);
        System.out.println("cuenta1 " + cuenta1.getSaldo());
        System.out.println("cuenta2 " + cuenta2.getSaldo());
        cuenta1.transferencia(cuenta2, 1000);
        System.out.println("cuenta1 " + cuenta1.getSaldo());
        System.out.println("cuenta2 " + cuenta2.getSaldo());
    }
}
