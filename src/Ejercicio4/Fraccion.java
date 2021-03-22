package Ejercicio4;

public class Fraccion {

    private int numerador;
    private int denominador;


    public Fraccion (){
        numerador = 0;
        denominador = 1;

    }


    public Fraccion (int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;


    }
    public Fraccion sumar(Fraccion a){
        Fraccion c =new Fraccion();
        c.numerador=a.numerador*this.denominador+this.numerador*a.denominador;
        c.denominador=a.denominador*this.denominador;
        return c;
    }
    public Fraccion sumar(int numero){
        Fraccion c =new Fraccion();
        c.numerador=numero*this.denominador+this.numerador*1;
        c.denominador=1*this.denominador;
        return c;
    }
    public Fraccion restar(Fraccion a){
        Fraccion c =new Fraccion();
        c.numerador=this.numerador*a.denominador - a.numerador*this.denominador ;
        c.denominador=a.denominador*this.denominador;
        return c;
    }
    public Fraccion restar(int numero){
        Fraccion c =new Fraccion();
        c.numerador= this.numerador*1 - numero*this.denominador ;
        c.denominador=1*this.denominador;
        return c;
    }

    public Fraccion multiplicar(Fraccion a){
        Fraccion c =new Fraccion();
        c.numerador=a.numerador*this.numerador;
        c.denominador=a.denominador*this.denominador;
        return c;
    }
    public Fraccion multiplicar(int numero){
        Fraccion c =new Fraccion();
        c.numerador=numero*this.numerador ;
        c.denominador=1*this.denominador;
        return c;
    }
    public Fraccion dividir( Fraccion b){
        return new Fraccion(this.numerador*b.denominador, this.denominador*b.numerador);
    }
    public Fraccion dividir( int numero){
        return new Fraccion(this.numerador*1, this.denominador*numero);
    }
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }


    @Override
    public String toString() {
        return numerador +"/"+ denominador;
    }
}
