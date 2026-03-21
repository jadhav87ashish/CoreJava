package Tut24_Collections;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        //Declarations
        HashSet mySet = new HashSet();
//        HashSet <String> myStringSet = new HashSet<String>();
//        HashSet <Integer> myIntSet = new HashSet<Integer>();
//        Set mySet = new HashSet();



        // Adding elements to hashset
        mySet.add(100);
        mySet.add(false);
        mySet.add("Ashish");
        mySet.add(true);
        mySet.add(50.50);
        mySet.add('A');
        mySet.add(null);
        mySet.add(null);

        //Printing HashSet
        System.out.println(mySet);


        // Remove specific element
        // here we need to remove a specific element using a value not by index
        mySet.remove(50.50);
        System.out.println("After removing 50.50 value: "+ mySet);

        //Inserting element
        // Inserting is not possible, we can add only which indexed randomly

        // Access specific element
        // Not possible
        // work around is convert hashSet to ArrayList
        ArrayList myList = new ArrayList(mySet);
        System.out.println("Printing array list "+myList);
        System.out.println("Element at 2nd index is "+myList.get(2));

        //Read all elements from HashSet
        //Approach 1 (Normal for loop)
        //Not possible since no index available


        // Approach 2 (Using for each loop)
        System.out.println("Reading all elements of HashSet using for each loop");
        for (Object x : mySet){
            System.out.println(x);
        }


        //Approach 3: Using Iterator
        System.out.println("Reading all elements of HashSet using Iterator");
        Iterator it = mySet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Size
        System.out.println("Size of HashSet is "+ mySet.size());

        //Removing all elements from HashSet
        mySet.clear();
        System.out.println("After removing all elements from HashSet, is HashSet Empty? "+ mySet.isEmpty());


    }
}
