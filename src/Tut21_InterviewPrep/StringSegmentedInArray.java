package Tut21_InterviewPrep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSegmentedInArray {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // empty string
        System.out.println(Arrays.toString(dp));
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("i="+i);
                System.out.println("j="+j);
                System.out.println(s.substring(j, i));
                System.out.println(dp[j] && set.contains(s.substring(j, i)));
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // no need to check further
                }
                System.out.println(Arrays.toString(dp));
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        List<String> dict1 = Arrays.asList("leet", "code");
        System.out.println(wordBreak(s1, dict1)); // true

//        String s2 = "applepenapple";
//        List<String> dict2 = Arrays.asList("apple", "pen");
//        System.out.println(wordBreak(s2, dict2)); // true
//
//        String s3 = "catssanddog";
//        List<String> dict3 = Arrays.asList("cats", "dog", "sand", "cat");
//        System.out.println(wordBreak(s3, dict3)); // false
    }
}
