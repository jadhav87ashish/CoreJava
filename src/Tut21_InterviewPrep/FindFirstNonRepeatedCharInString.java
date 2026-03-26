package Tut21_InterviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//public class FindFirstNonRepeatedCharInString {
//
//    public static void main(String[] args) {
//
//
//        String str = "AAJJ";
//        Character ch=null;
//        HashMap <Character,Integer> hm = new HashMap<Character,Integer>();
//
//        for (char c : str.toCharArray()){
//            hm.put(c,hm.getOrDefault(c,0)+1);
//        }
//
//        for (char c : str.toCharArray()){
//            if (hm.get(c)==1){
//                ch = c;
//                break;
//            }
//        }
//
//        System.out.println(ch!=null? ch :"-1");
//    }
//}

public class FindFirstNonRepeatedCharInString {

    public static void main(String[] args) {
        String input = "AAJJ";
        Character result = findFirstNonRepeating(input);
        System.out.println(result != null ? result : "No non-repeating character found " +-1);
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