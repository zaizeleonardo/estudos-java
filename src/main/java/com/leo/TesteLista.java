package com.leo;


import java.util.ArrayList;

public class TesteLista {
    static void main() {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Bruna");
        nomes.add("Rafa");
        nomes.add("Pedro");

        System.out.println("Total: " + nomes.size());
        System.out.println("Primeiro: " + nomes.get(0));

        for(String nome : nomes){
            System.out.println("Olá, " + nome);
        }

    }
}
