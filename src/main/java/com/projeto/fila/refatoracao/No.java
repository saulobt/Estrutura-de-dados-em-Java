package com.projeto.fila.refatoracao;

public class No {
    private Object objeto;
    private No referenciaProximoNo;

    public No() {
    }

    public No(Object objeto) {
        this.referenciaProximoNo=null;
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
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
                "objeto=" + objeto +
                '}';
    }
}
