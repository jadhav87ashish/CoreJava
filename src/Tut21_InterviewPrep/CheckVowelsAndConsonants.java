package Tut21_InterviewPrep;

public class CheckVowelsAndConsonants{
    public static void main(String [] args){
        int vowelsCount = 0;
        int consonantsCount = 0;
        char arr [] = {'a','e','i','o','u'};
        String str = "Welcome";
        char cArr[] = str.toCharArray();
        for (int j = 0; j<cArr.length;j++){
            if (cArr[j]==arr[0]||cArr[j]==arr[1]||cArr[j]==arr[2]||cArr[j]==arr[3]){
                vowelsCount = vowelsCount+1;
            }
            else{
                consonantsCount=consonantsCount+1;
            }

        }
        System.out.println("vowels Count is "+vowelsCount);
        System.out.println("consonants  Count is "+consonantsCount);
    }
}

//OR
//public class CheckVowelsAndConsonants {
//public static void main(String[] args) {
//    int vowelsCount = 0;
//    int consonantsCount = 0;
//    String str = "Welcome".toLowerCase(); // Convert to lowercase to handle 'W'
//
//    for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//
//        // Check if it's a vowel
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//            vowelsCount++;
//        }
//        // Check if it's a letter (to avoid counting spaces/numbers as consonants)
//        else if (ch >= 'a' && ch <= 'z') {
//            consonantsCount++;
//        }
//    }
//
//    System.out.println("Vowels Count: " + vowelsCount);
//    System.out.println("Consonants Count: " + consonantsCount);
//}
//}