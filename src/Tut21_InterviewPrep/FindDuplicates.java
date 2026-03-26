package Tut21_InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        String str = "programming";

        // Step 1: Create a HashMap to store char and its count
        Map<Character, Integer> charMap = new HashMap<>();

        // Step 2: Traverse the string and update counts
        for (char ch : str.toCharArray()) {
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