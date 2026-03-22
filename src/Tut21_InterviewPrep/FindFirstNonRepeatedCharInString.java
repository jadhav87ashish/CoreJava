package Tut21_InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharInString {

    public static void main(String[] args) {
        String input = "ProgrammingP";
        Character result = findFirstNonRepeating(input);
        System.out.println(result != null ? result : "No non-repeating character found");
    }


    public static Character findFirstNonRepeating(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        // First pass: Build frequency map
        for (char c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Second pass: Find first character with frequency 1
        for (char c : str.toCharArray()) {
            if (hm.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}