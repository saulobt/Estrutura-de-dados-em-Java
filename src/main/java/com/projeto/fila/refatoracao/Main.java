package com.projeto.fila.refatoracao;



public class Main {
    public static void main(String[] args) {
        Fila minhafila = new Fila();
        minhafila.enqueue(new No("primeiro"));
        minhafila.enqueue(new No("segundo"));
        minhafila.enqueue(new No("terceiro"));
        minhafila.enqueue(new No("quarto"));

        System.out.println(""+minhafila);
        System.out.println("Pegando o Primeiro Nó: "+minhafila.dequeue());
        System.out.println(minhafila);
        minhafila.enqueue(new No("ultimo"));
        System.out.println(minhafila);
        System.out.println("Quem é o Primeiro? "+minhafila.fisrt());
        System.out.println(minhafila);
    }
}
