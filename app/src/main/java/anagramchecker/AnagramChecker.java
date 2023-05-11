package anagramchecker;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String word1, String word2){
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] a1 = word1.toCharArray();
        char[] a2 = word2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
