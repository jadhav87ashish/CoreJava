package Tut24_Collections;

import java.util.*;

public class ConvertingStringArrayInArrayList {
    public static void main(String[] args) {


        String [] strArray = {"Amit", "Ajit", "Amay", "Ranver", "Aarvi"};


        // convert in ArrayList
        ArrayList aList = new ArrayList(Arrays.asList(strArray));
        System.out.println(aList);


        // convert in LinkedList
        LinkedList llist = new LinkedList(Arrays.asList(strArray));
        System.out.println(llist);

        // convert in HashSet
        HashSet hs = new HashSet(Arrays.asList(strArray));
        System.out.println(hs);

        // convert in LinkedHashSet
        LinkedHashSet lhs = new LinkedHashSet(Arrays.asList(strArray));
        System.out.println(lhs);

    }
}
