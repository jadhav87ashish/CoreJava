package Tut21_InterviewPrep;

public class FindSmallestFromArray{
    public static void main (String [] args){
        int [] arr = {20,5,3,10,15,20,15,30};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}