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