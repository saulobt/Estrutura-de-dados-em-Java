package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println("intA = "+intA+" IntB = "+intB);
        intA=2;
        System.out.println("intA = "+intA+" IntB = "+intB);

        MeuObjeto objA = new MeuObjeto(1);
        MeuObjeto objB = objA;
        System.out.println("objA = "+objA+" objB = "+objB);
        objA.setNumero(2);
        System.out.println("objA = "+objA+" objB = "+objB);
    }
}
