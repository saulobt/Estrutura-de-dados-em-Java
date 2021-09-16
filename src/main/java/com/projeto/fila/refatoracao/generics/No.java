package com.projeto.fila.refatoracao.generics;

public class No<T> {
    private T object;
    private No<T> referenciaProximoNo;

    public No() {
    }

    public No(T object) {
        this.referenciaProximoNo=null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setobject(T object) {
        this.object = object;
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
                "object=" + object +
                '}';
    }
}
