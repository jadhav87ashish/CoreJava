package Tut24_Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        // HashTable: data stored in key value pair
        // key is always unique while value can be duplicate
        // Insertion order not preserved
        // key value together called Entry
        // null key NOT allowed once UNLIKE HashMap
        // null values NOT allowed UNLIKE HashMap


        // declaration
        // Hashtable ht = new Hashtable();
        // Map ht = new Hashtable();
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();


        // Adding data pairs
        ht.put(1,"Ashish");
        ht.put(2,"Amit");
        ht.put(3,"Ajay");
        ht.put(4,"Akshay");
//        ht.put(5,null); // Not allowed, NullPointerException
//        ht.put(null,null); // Not allowed, NullPointerException
//        ht.put(null,null); // Not allowed, NullPointerException

        System.out.println(ht);

        // size of hashmap
        System.out.println("Size of hash map is "+ ht.size());

        // remove specific pair
        ht.remove(4);
        System.out.println(ht);


        // access value of specific key
        System.out.println(ht.get(2));

        // check element is present or not, if present it returns actual value, if not present return default value specified in param below
        ht.put(10, ht.getOrDefault(10, "0"));
        System.out.println(ht);


        // to find duplicates
        System.out.println(ht.containsKey(3));// true
        System.out.println(ht.containsKey(4));// false
        System.out.println(ht.containsValue("Amit"));// true
        System.out.println(ht.containsValue("QWERTY"));// false


        // get all keys from hashmap
        System.out.println(ht.keySet());

        //get all values
        System.out.println(ht.values());

        // get all key value pairs
        System.out.println(ht.entrySet());

        // reading data from hashmap
        //approach 1 (For each loop)
        System.out.println("Using For each loop");
        for (int k : ht.keySet()){
            System.out.println(k + "   "+ ht.get(k));
        }


        // approach 2 (Iterator)
        System.out.println("Using Iterator");
        Iterator<Map.Entry<Integer,String>> it = ht.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }


        // clear all records
        ht.clear();
        System.out.println(ht.size());
        System.out.println(ht.isEmpty());



    }
}
