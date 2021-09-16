package com.projeto.listaencadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> myList = new ListaEncadeada<>();
        myList.add("teste1");
        myList.add("teste2");
        myList.add("teste3");
        myList.add("teste4");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));

        System.out.println(myList);

        System.out.println("Removendo Index 2: " + myList.remove(2));//index2 é o teste 3 da lista!
        System.out.println(myList);
    }
}
