package Tut24_Collections;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // insertion order preserved
        // duplicates allowed
        // heterogeneous data not allowed


        PriorityQueue q = new PriorityQueue();

        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("E");
        q.add("E");


        System.out.println(q);


        // get head element
        System.out.println(q.element());// returns head element (NoSuchElementException exception if empty)
        System.out.println(q.peek()); // returns head element (null if empty)


        // return head element and remove from queue
        System.out.println(q.remove()); // retrun head element while removing it (NoSuchElementException exception if empty)
        System.out.println(q);

        System.out.println(q.poll()); // retrun head element while removing it (null if empty)
        System.out.println(q);


        // print all elements of queue
        //Approach1 using iterator
        System.out.println("Approach1 using iterator");
        Iterator it = q.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        //Approach 2 using for each loop
        System.out.println("Approach 2 using for each loop");
        for (Object obj : q){
            System.out.println(obj);
        }

    }
}
