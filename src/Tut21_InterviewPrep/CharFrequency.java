package Tut21_InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            // getOrDefault(ch, 0) handles both new and existing characters
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Print occurrences
        freqMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}