package Tut21_InterviewPrep;

public class FindLagestFromArray{
    public static void main (String [] args){
        int [] arr = {4,5,3,10,15,20,15,30,15};
        int max = 0;
        for (int i = 0; i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}