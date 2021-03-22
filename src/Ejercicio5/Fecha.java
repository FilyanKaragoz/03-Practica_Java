package Ejercicio5;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public boolean fechaValida()
    {
    try {
        LocalDate fechaLocal = LocalDate.of( this.año , this.mes , this.dia ) ;
        return true ;
    } catch ( Exception e ) {
        return false;
    }
    }
    public void agregarDias(int dias){
        LocalDate fechaLocal = LocalDate.of( this.año , this.mes , this.dia ).plusDays(dias);
        this.setDia(fechaLocal.getDayOfMonth());
        this.setMes(fechaLocal.getMonthValue());
        this.setAño(fechaLocal.getYear());
    }

}
