package com.projeto.pilha;

public class No {
//    estrutura de pilha simples
    private int dado;
    private No referenciaProximoNo = null;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getReferenciaProximoNo() {
        return referenciaProximoNo;
    }

    public void setReferenciaProximoNo(No referenciaProximoNo) {
        this.referenciaProximoNo = referenciaProximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
