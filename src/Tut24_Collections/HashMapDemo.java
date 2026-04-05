package Tut24_Collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // Hashmap: data stored in key value pair
        // key is always unique while value can be duplicate
        // Insertion order not preserved
        // key value together called Entry
        // null key allowed once
        // null values allowed multiple times


        // declaration
        // HashMap hm = new HashMap();
        // Map hm = new HashMap();
        HashMap<Integer,String> hm = new HashMap<Integer,String>();


        // Adding data pairs
        hm.put(1,"Ashish");
        hm.put(2,"Amit");
        hm.put(3,"Ajay");
        hm.put(4,"Akshay");
        hm.put(5,null);
        hm.put(null,null);
        hm.put(null,null); // not allowed, this entry will be removed

        System.out.println(hm);

        // size of hashmap
        System.out.println("Size of hash map is "+ hm.size());

        // remove specific pair
        hm.remove(4);
        System.out.println(hm);


        // access value of specific key
        System.out.println(hm.get(2));

        // check element is present or not, if present it returns actual value, if not present return default value specified in param below
        hm.put(10, hm.getOrDefault(10, "0"));
        System.out.println(hm);


        // to find duplicates
        System.out.println(hm.containsKey(3));// true
        System.out.println(hm.containsKey(4));// false
        System.out.println(hm.containsValue("Amit"));// true
        System.out.println(hm.containsValue("QWERTY"));// false


        // get all keys from hashmap
        System.out.println(hm.keySet());

        //get all values
        System.out.println(hm.values());

        // get all key value pairs
        System.out.println(hm.entrySet());

        // reading data from hashmap
        //approach 1 (For each loop)
        System.out.println("Using For each loop");
        for (Object k : hm.keySet()){
            System.out.println(k + "   "+ hm.get(k));
        }


        // approach 2 (Iterator)
        System.out.println("Using Iterator");
        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }


        // clear all records
        hm.clear();
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());



    }
}
