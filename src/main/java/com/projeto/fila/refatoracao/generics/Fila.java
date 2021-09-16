package com.projeto.fila.refatoracao.generics;

public class Fila<T> {
    private No<T> referenciaNoEntradaFila;

    public Fila() {
        this.referenciaNoEntradaFila = null;
    }

    public boolean isEmpty(){
        return referenciaNoEntradaFila == null ? true:false;
    }

    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setReferenciaProximoNo(referenciaNoEntradaFila);
        referenciaNoEntradaFila = novoNo;
    }

    public T fisrt(){
        if (!isEmpty()){
            No primeiroNo = referenciaNoEntradaFila;
            while (true){
                if (primeiroNo.getReferenciaProximoNo() != null){
                    primeiroNo = primeiroNo.getReferenciaProximoNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!isEmpty()){
            No primeiroNo = referenciaNoEntradaFila;
            No noAuxiliar = referenciaNoEntradaFila;
            while (true){
                if (primeiroNo.getReferenciaProximoNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaProximoNo();
                } else {
                    noAuxiliar.setReferenciaProximoNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuffer cabecalho = new StringBuffer();
        cabecalho.append("--------FILA---------\n");
        StringBuffer body = new StringBuffer();

        No noAuxiliar = referenciaNoEntradaFila;
        body.append(cabecalho);
        if (referenciaNoEntradaFila != null){
            while (true){
                body.append("[No{Object="+noAuxiliar.getObject()+"}]--->");
                if (noAuxiliar.getReferenciaProximoNo() != null){//verifica se tem so um no...
                    noAuxiliar = noAuxiliar.getReferenciaProximoNo();
                } else {
                    body.append("null");
                    break;
                }
            }
        } else {
            body.append("null");
        }
        body.append("\n========FIM========");

        return body.toString();
    }
}
