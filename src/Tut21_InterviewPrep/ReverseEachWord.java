package Tut21_InterviewPrep;

import java.util.Arrays;
public class ReverseEachWord{
    public static void main (String [] args){
        String str ="My Name Is Ashish";
        String revEach = "";
        String arr [] = str.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            String local = arr[i];
            String localRev = "";
            for (int j = local.length()-1; j>=0; j--){
                localRev = localRev + local.charAt(j);
            }
            revEach = revEach + " " + localRev;
        }
        System.out.println(revEach);
    }
}