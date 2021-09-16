package com.projeto.fila.refatoracao;


import com.projeto.fila.refatoracao.generics.Fila;

public class Main {
    public static void main(String[] args) {
        Fila minhafila = new Fila();
        minhafila.enqueue("primeiro");
        minhafila.enqueue("segundo");
        minhafila.enqueue("terceiro");
        minhafila.enqueue("quarto");

        System.out.println(""+minhafila);
        System.out.println("Pegando o Primeiro Nó: "+minhafila.dequeue());
        System.out.println(minhafila);
        minhafila.enqueue("ultimo");
        System.out.println(minhafila);
        System.out.println("Quem é o Primeiro? "+minhafila.fisrt());
        System.out.println(minhafila);
    }
}
