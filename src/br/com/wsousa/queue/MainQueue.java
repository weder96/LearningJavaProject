package br.com.wsousa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        //We cannot create instance of a Queue since it is an interface, thus we
        Queue<String> q1 = new LinkedList<>();
        //Adding elements to the Queue
        q1.add("I");
        q1.add("Love");
        q1.add("Rock");
        q1.add("And");
        q1.add("Roll");
        System.out.println("Elements in Queue:" + q1);
        /*
         * We can remove an element from Queue using remove() method, this removes the
         * first element from the Queue
         */
        System.out.println("Removed element: " + q1.remove());
        /*
         * element() method - this returns the head of the Queue.
         */
        System.out.println("Head: " + q1.element());
        /*
         *poll() method - this removes and returns the
         *head of the Queue. Returns null if the Queue is empty
         */
        System.out.println("poll(): "+q1.poll());
        /*
         *peek() method - it works same as element() method,
         *however, it returns null if the Queue is empty
         */
        System.out.println("peek(): "+q1.peek());
        //Displaying the elements of Queue
        System.out.println("Elements in Queue:"+q1);

    }

}
