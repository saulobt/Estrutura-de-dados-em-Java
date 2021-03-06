package com.projeto.listaduplamenteencadeada;


public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;

    }

    public int size() {
        return tamanhoLista;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && noAuxiliar != null; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(ultimoNo);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setProximoNo(noAuxiliar);

        if (novoNo.getProximoNo() != null) {
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getProximoNo().setProximoNo(novoNo);
        } else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoAnterior().setProximoNo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index) {

        if (index == 0) {
            primeiroNo = primeiroNo.getProximoNo();
            if (primeiroNo != null) {
                primeiroNo.setNoAnterior(null);
            }

        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setProximoNo(noAuxiliar.getProximoNo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getProximoNo().setNoAnterior(noAuxiliar.getNoAnterior());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
    }

    @Override
    public String toString() {

        StringBuffer cabecalho = new StringBuffer();
        cabecalho.append("===LISTA DUPLAMENTE ENCADEADA===\n");
        StringBuffer body = new StringBuffer();
        body.append(cabecalho);

        NoDuplo<T> noAuxiliar = primeiroNo;


        for (int i = 0; i < size(); i++) {
            body.append("[No{conte??do=" + noAuxiliar.getConteudo() + "}]--->");
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        body.append("null");
        body.append("\n=========FIM=========");
        return body.toString();
    }
}
