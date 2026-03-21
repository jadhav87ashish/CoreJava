package Tut21_InterviewPrep;
//
//import java.util.Arrays;
//public class FindSecondLargest {
//    public static void main(String[] args) {
//        int[] arr = {4, 5, 3, 10, 15, 20, 15, 30, 28, 25};
//        Arrays.sort(arr);
//        System.out.println("Second Largest: " + arr[arr.length-2]);
//    }
//}


public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 10, 15, 20, 15, 30, 28, 25};

        // Initialize with very small values or the first element
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // If new max is found, the old max becomes secondMax
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                // If current number is between max and secondMax
                secondMax = arr[i];
            }
        }
        System.out.println("Second Largest: " + secondMax);
    }
}