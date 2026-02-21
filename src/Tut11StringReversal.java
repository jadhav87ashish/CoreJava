import java.lang.reflect.Array;
import java.util.Arrays;

public class Tut11StringReversal {
    public static void main(String[] args) {

    // String reversal

        String str = "Ashish";
        // Approach1: using .length() and .charAt()

        String revString="";
        for (int i = str.length()-1; i>=0;i--){
            revString=revString+str.charAt(i);
        }
        System.out.println(revString);


        // Approach2: using .toCharArray()
        String reversedS="";
        char a[] = str.toCharArray();
        for (int i = a.length-1; i>=0;i--){
            reversedS=reversedS+a[i];
        }
        System.out.println(reversedS);


        // Approach2: using StringBuffer/StringBuilder
        //Declarations
        StringBuffer sbf = new StringBuffer("Welcome");
        StringBuilder sbl = new StringBuilder("Ashish");

        System.out.println(sbf.reverse());
        System.out.println(sbl.reverse());


        //Mutable: Capable to change
        int arr[]={45,353,78,213,36,45,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // array go changed means its mutable

        // Immutable: Does not change
        String newStr = new String("Welcome");
        newStr.concat(" to java");
        System.out.println(newStr); // original value will not change

        // how string buffer is mutable
        StringBuffer stb = new StringBuffer("Welcome");
        stb.append(" to java");
        System.out.println(stb);

        // how string builder is mutable
        StringBuilder stl = new StringBuilder("Welcome");
        sbl.append(" to jungle");
        System.out.println(sbl);




    }
}
