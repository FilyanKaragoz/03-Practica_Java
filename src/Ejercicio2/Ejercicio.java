package Ejercicio2;

public class Ejercicio {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        System.out.println(contador1.getCont());

        Contador contador2 = new Contador(10);
        System.out.println(contador2.getCont());

        Contador contador3 = new Contador(contador1);
        System.out.println(contador3.getCont());

        contador2.incrementar();
        System.out.println(contador2.getCont());

        contador3.decrementar();
        System.out.println(contador3.getCont());

    }
}
