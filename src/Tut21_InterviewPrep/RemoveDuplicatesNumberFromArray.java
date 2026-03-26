package Tut21_InterviewPrep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> set = new LinkedHashSet<>(); // maintains order

        for (int num : arr) {
            set.add(num);
        }

        // Convert Set back to array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        System.out.println(Arrays.toString(result));
    }

}