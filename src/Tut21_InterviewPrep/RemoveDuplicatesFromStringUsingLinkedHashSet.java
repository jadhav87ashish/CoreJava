package Tut21_InterviewPrep;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromStringUsingLinkedHashSet {
    public static void main(String[] args) {
        String str = "Programming";
        LinkedHashSet <Character> charLHS = new LinkedHashSet <Character> ();

        for (int i = 0; i<str.length()-1;i++){
            charLHS.add(str.charAt(i));
        }
        System.out.println(charLHS);
    }
}
