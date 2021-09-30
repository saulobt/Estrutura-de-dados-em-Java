package com.projeto.listaduplamenteencadeada;

import com.projeto.listaencadeada.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> myListDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();
        myListDuplamenteEncadeada.add("c1");
        myListDuplamenteEncadeada.add("c2");
        myListDuplamenteEncadeada.add("c3");
        myListDuplamenteEncadeada.add("c4");
        myListDuplamenteEncadeada.add("c5");
        myListDuplamenteEncadeada.add("c6");
        myListDuplamenteEncadeada.add("c7");
        System.out.println(myListDuplamenteEncadeada);
        myListDuplamenteEncadeada.remove(3);
        myListDuplamenteEncadeada.add(3, "99");
        System.out.println(myListDuplamenteEncadeada);
        System.out.println(myListDuplamenteEncadeada.get(3));
    }
}
