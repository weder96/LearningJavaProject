package br.com.yohana.generics;

import br.com.yohana.repository.Address;

import java.util.ArrayList;

public class ExecutoraPair {
    public static void main(String[] args) {
        var pair = new Pair<String, String>("Joao", "Maria");
        System.out.println(pair.getKey());

        var pair2 = new Pair<String, Integer>("Joao", 2);
        System.out.println(pair2.getKey());
        System.out.println(pair2.getValue());

        var nomes = new ArrayList<String>();
    }
}
