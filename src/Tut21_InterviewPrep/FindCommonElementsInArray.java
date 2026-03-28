package Tut21_InterviewPrep;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsInArray {
    public static void main(String [] args){
        int[] arr1 = {1, 2, 3, 2, 4, 1, 5};
        int[] arr2 = {1, 15, 6, 10, 8, 9, 4};


        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Store first array in set
        for (int num : arr1) {
            set.add(num);
        }

        // Check common elements
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        System.out.println("Common elements: " + result);

//        for (int i = 0; i<=arr1.length-1; i++){
//            for (int j = 0; j<=arr2.length-1;j++){
//                if (arr1[i]==arr2[j]){
//
//                    System.out.println(arr1[i]+" is common in both arrays");
//                }
//            }
//        }
    }
}