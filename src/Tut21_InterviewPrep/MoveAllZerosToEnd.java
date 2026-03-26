package Tut21_InterviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {

        int [] arr = {1,2,3,0,0,0,0,4,0,5,0,6,7};
        Arrays.sort(arr);
        Integer [] rev = new Integer[arr.length];
        int j =0;
        for (int i = arr.length-1; i >=0; i--){
            rev[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(rev));
    }
}