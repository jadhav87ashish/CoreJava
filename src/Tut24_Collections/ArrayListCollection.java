package Tut24_Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListCollection {
    public static void main(String[] args) {
        //declarations
        ArrayList myList = new ArrayList(); // heterogeneous data
        // ArrayList <String> myList = new ArrayList <String>();
        // ArrayList <Integer> myList = new ArrayList <Integer>();
        //List myList = new ArrayList();


        myList.add(100);
        myList.add("Ashish");
        myList.add(true);
        myList.add(100.15);
        myList.add(true);
        myList.add("A");
        myList.add(null);
        myList.add(null);

        System.out.println(myList);

        System.out.println("Size of array is "+ myList.size());


        // remove specific element
        myList.remove(5);
        System.out.println("After removing element on 5th Index "+ myList);

        // sorting and shuffling (this needs homogeneous data in arraylist)
//        Collections.sort(myList);
//        System.out.println("After sorting ascending "+ myList);
//
//        Collections.sort(myList,Collections.reverseOrder());
//        System.out.println("After sorting reverse order "+ myList);
//
//        Collections.shuffle(myList);
//        System.out.println("After shuffling "+ myList);


        //Inserting element in between
        myList.add(2,"java");
        System.out.println("After inserting element in between "+ myList);


        // Modify/replace/change single element
        myList.set(2,"Python");
        System.out.println("After replacing an element "+ myList);


        // Access specific element
        System.out.println("Element at index 2 is "+myList.get(2));
        System.out.println("Element at index 0 is "+myList.getFirst());
        System.out.println("Element at index last is "+myList.getLast());

        // Reading all elements from the array
        // Approach 1 (Normal for loop)
        System.out.println("Reading all elements using Normal for loop");
        for (int i = 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }

        // Approach 2 (for each loop)
        System.out.println("Reading all elements using for each loop");
        for (Object x : myList){
            System.out.println(x);
        }

        // Approach 3 (Using Iterator)
        System.out.println("Reading all elements using Iterator");
        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //check ArrayList is empty or not
        System.out.println("Array List is empty? "+myList.isEmpty());


        //Remove specific elements from an array list
        myList.remove(2);
        System.out.println("After removing element from index 2: "+myList);


        // Remove all elements from the Array list
        myList.clear();
        System.out.println("After removing all elements from array list, Is empty? "+ myList.isEmpty());













    }
}
