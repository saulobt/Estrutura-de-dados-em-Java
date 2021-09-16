package com.projeto.fila;

public class Fila {
    private No referenciaNoEntradaFila;

    public Fila() {
        this.referenciaNoEntradaFila = null;
    }

    public boolean isEmpty(){
        return referenciaNoEntradaFila == null ? true:false;
    }

    public void enqueue(No novoNo){
        novoNo.setReferenciaProximoNo(referenciaNoEntradaFila);
        referenciaNoEntradaFila = novoNo;
    }

    public No fisrt(){
        if (!isEmpty()){
            No primeiroNo = referenciaNoEntradaFila;
            while (true){
                if (primeiroNo.getReferenciaProximoNo() != null){
                    primeiroNo = primeiroNo.getReferenciaProximoNo();
                } else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No dequeue(){
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
            return primeiroNo;
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
                body.append("[No{Object="+noAuxiliar.getObjeto()+"}]--->");
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
