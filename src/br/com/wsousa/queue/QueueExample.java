package br.com.wsousa.queue;

import br.com.wsousa.model.Customer;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Customer> queue1 = new LinkedList<>();
        Customer customer = new Customer("Weder");
        customer.setAge(21);
        queue1.add(customer);

        Queue<Customer> queue2 = new ArrayDeque<>();
        queue2.add(new Customer("Yohana"));
        queue2.remove();

        Queue<Customer> queue3 = new PriorityQueue<>();


        Queue queue4 = new LinkedList<>();
        queue4.add(new Customer("Yohana"));
        queue4.add("Weder");


        Queue<String> queue5 = new LinkedList<>();
        queue5.offer("Patricia");
        queue5.offer("John");

        queue5.poll();

        Iterator<String> iter = queue5.iterator();
        while(iter.hasNext()){
            String nextElement = iter.next();
            System.out.println(" ============= "+ nextElement);
        }

        for(String nome: queue5)
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ nome);

        queue5.stream().forEach(System.out::println);


        for(Customer cust: queue1){
            System.out.println("##########"+ cust.getFirstName());
            System.out.println("##########"+ cust.getAge());
        }

    }
}
