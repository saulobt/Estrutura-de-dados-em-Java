package com.projeto.no.encadeamentodeno;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteudo nó 1");
        No no2 = new No("Conteudo nó 2");
        no1.setProximoNo(no2);
        No no3 = new No("Conteudo nó 3");
        no2.setProximoNo(no3);
        No no4 = new No("Conteudo nó 4");
        no3.setProximoNo(no4);
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println("--------------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

        // no 1 aponta para no 2 > no 3 > no 4 que aponta para null, fim.

    }
}
