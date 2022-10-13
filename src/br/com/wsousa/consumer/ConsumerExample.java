package br.com.yohana.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> con1 = (s) -> {System.out.println(s.toUpperCase());};
        con1.accept("java11");

        Consumer<String> con2 = (s) -> {System.out.println(s.toLowerCase());};
        con2.accept("JAVA11");
    }
}
