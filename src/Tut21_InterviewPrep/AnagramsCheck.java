package Tut21_InterviewPrep;

import java.util.Arrays;
public class AnagramsCheck{
    public static void main(String [] lskdj){
        String str1 = "Ashish".toLowerCase();
        String str2 = "shshiA".toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagrams");
        }  else{
            System.out.println("Not Anagrams");
        }

    }
}