package Tut21_InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfEachChar {
    public static void main(String [] args){
        String str = "Welcome to ProSDETwithAJ";
        char cArr[] = str.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : cArr) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println("Character occurrences in '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}


