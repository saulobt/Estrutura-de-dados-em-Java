package com.projeto.fila.refatoracao.generics;


public class Main {
    public static void main(String[] args) {
        Fila<String> minhafila = new Fila<>();
        minhafila.enqueue("primeiro");
        minhafila.enqueue("segundo");
        minhafila.enqueue("terceiro");
        minhafila.enqueue("quarto");
        //minhafila.enqueue(1);

        System.out.println(""+minhafila);
        System.out.println("Pegando o Primeiro Nó: "+minhafila.dequeue());
        System.out.println(minhafila);
        minhafila.enqueue("ultimo");
        System.out.println(minhafila);
        System.out.println("Quem é o Primeiro? "+minhafila.fisrt());
        System.out.println(minhafila);
    }
}
