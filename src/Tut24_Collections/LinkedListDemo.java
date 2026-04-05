package Tut24_Collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.add(100);
        llist.add("Ashish");
        llist.add(15.5);
        llist.add('A');
        llist.add(true);
        llist.add(null);


        System.out.println(llist.size());

        // removing specific element
        llist.remove(1);
        System.out.println(llist);

        // adding element to specific location
        llist.add(2, "Java");
        System.out.println(llist);

        //updating value of specific index
        llist.set(2,"Python");
        System.out.println(llist.get(2));
        System.out.println(llist.contains("Python"));// true

        System.out.println(llist.isEmpty());//false


        //reading values

        //approach1 (Using for loop)
        System.out.println("Using for loop");
        for (int i = 0; i<=llist.size()-1;i++){
            System.out.println(llist.get(i));
        }


        //approach2 (Using for each loop)
        System.out.println("Using for each loop");
        for (Object e : llist){
            System.out.println(e);
        }


        // using iterator
        System.out.println("Using Iterator");
        Iterator it = llist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        // additional linked list methods
        llist.addFirst("Tiger");
        llist.addLast("Cat");
        System.out.println(llist.getFirst());
        System.out.println(llist.getLast());

        llist.removeFirst();
        llist.removeLast();
        System.out.println(llist.getFirst());
        System.out.println(llist.getLast());

    }
}
