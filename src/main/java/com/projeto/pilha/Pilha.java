package com.projeto.pilha;
//implementação do conceito pilha LIFO
public class Pilha {

    private No referenciaNoEntradaPilha;

    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

    public boolean isEmpty(){
//        if (referenciaNoEntradaPilha == null ) {
//            return true;
//        }
//            return false;
        return referenciaNoEntradaPilha == null ? true:false;
    }

    public No top(){
        return referenciaNoEntradaPilha;
    }

    public void push(No novoNo){
        No referenciaNoAuxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        referenciaNoEntradaPilha.setReferenciaProximoNo(referenciaNoAuxiliar);
    }

    public No pop(){
        if (!isEmpty()){
            No noPoped = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaProximoNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {


        StringBuffer cabecalho = new StringBuffer();
        cabecalho.append("---------------------\n");
        cabecalho.append("--------PILHA--------\n");
        cabecalho.append("---------------------\n");
        StringBuffer body = new StringBuffer();

        No refNoAuxiliar = referenciaNoEntradaPilha;

        body.append(cabecalho);

        while (true){
            if (refNoAuxiliar != null){
                body.append("[No{dado="+refNoAuxiliar.getDado()+"}]\n");
                refNoAuxiliar = refNoAuxiliar.getReferenciaProximoNo();
            } else {
                break;
            }
        }

        body.append("========FIM========\n");

        return body.toString();
    }
}
