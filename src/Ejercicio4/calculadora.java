package Ejercicio4;

public class calculadora {

    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(10,5);
        Fraccion fraccion2 = new Fraccion(1,5);

        System.out.println((fraccion1.sumar(fraccion2)).toString());
        System.out.println((fraccion1.restar(fraccion2)).toString());
        System.out.println((fraccion1.restar(8)).toString());
        System.out.println((fraccion1.multiplicar(8)).toString());
        System.out.println((fraccion1.dividir(8)).toString());
    }
}
