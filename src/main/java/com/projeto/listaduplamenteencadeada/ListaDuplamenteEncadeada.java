package com.projeto.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;

    }

    public int size(){
        return tamanhoLista;
    }
}
