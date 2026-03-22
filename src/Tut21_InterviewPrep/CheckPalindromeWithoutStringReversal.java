package Tut21_InterviewPrep;

public class CheckPalindromeWithoutStringReversal {
    public static void main(String[] args) {
        String str = "Madam";
        String cleanStr = str.toLowerCase(); // Handle case sensitivity
        boolean isPalindrome = true;
        int start = 0;
        int end = cleanStr.length() - 1;

        while (start < end) {
            if (cleanStr.charAt(start) != cleanStr.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isPalindrome ? "It's a Palindrome" : "Not a Palindrome");
    }


}
