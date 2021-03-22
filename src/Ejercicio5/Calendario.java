package Ejercicio5;

public class Calendario {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(12,12,2020);
        System.out.println(fecha1.fechaValida());
        fecha1.agregarDias(10);
        System.out.println(fecha1.getAño() + "-" + fecha1.getMes() + "-" + fecha1.getDia() );

        fecha1.agregarDias(60);
        System.out.println(fecha1.getAño() + "-" + fecha1.getMes() + "-" + fecha1.getDia() );

        Fecha fecha2 = new Fecha(90,12,2020);
        System.out.println(fecha2.fechaValida());

    }
}
