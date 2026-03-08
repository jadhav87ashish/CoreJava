package Tut21_InterviewPrep;

public class CheckPalindrome{
public static void main (String [] args){
    String str ="MADAMa";
    System.out.println(str.length());
    String rev = "";
        for (int i = str.length()-1; i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev)){
        System.out.println("Its a Palindrome");
        }
        else {
           System.out.println("Its not a Palindrome");
        }
    }
}