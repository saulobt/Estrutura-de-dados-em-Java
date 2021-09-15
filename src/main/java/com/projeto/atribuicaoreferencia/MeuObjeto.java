package com.projeto.atribuicaoreferencia;

public class MeuObjeto {
    Integer numero;

    public MeuObjeto(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "MeuObjeto{" +
                "numero=" + numero +
                '}';
    }
}
