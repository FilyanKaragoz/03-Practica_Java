package Ejercicio3;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setAutor("Karagoz");
        libro1.setIsbn(123124);
        libro1.setTitulo("Aprendiendo Java");
        System.out.println(libro1.toString());
        System.out.println(libro1.estaPrestado());
        libro1.prestamo();
        System.out.println(libro1.estaPrestado());

        Libro libro2 = new Libro(123213, "Biografía", "Filyan");
        System.out.println(libro2.toString());
        libro2.prestamo();
        System.out.println(libro2.estaPrestado());
        libro2.devolucion();
        System.out.println(libro2.estaPrestado());
    }
}
