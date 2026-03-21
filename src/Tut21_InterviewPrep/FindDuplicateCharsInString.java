package Tut21_InterviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharsInString {
    public static void main(String [] args){
        String str = "programming";
        char[] chars = str.toCharArray();

        // Step 1: Create a HashMap to store char and its count
        Map<Character, Integer> charMap = new HashMap<>();

        // Step 2: Traverse the string and update counts
        for (char ch : chars) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        // Step 3: Print characters with a count > 1
        System.out.println("Duplicate characters in '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}



//public class FindDuplicateCharsInString {
//    public static void main(String [] lskdj){
//        String str = "Welcome to ProSDETwithAJ";
//        char cArr[] = str.toCharArray();
//        Arrays.sort(cArr);
//        for (int i = 0; i<cArr.length-1;i++){
//            if (cArr[i]==cArr[i+1]){
//                System.out.println("Duplicate char is "+cArr[i]);
//            }
//        }
//    }
//}