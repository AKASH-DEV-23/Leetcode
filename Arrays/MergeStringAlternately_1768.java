package Arrays;

public class MergeStringAlternately_1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0;
        while (i < len1 || i < len2) {
            if (i < len1) {
                sb.append(word1.charAt(i));
            }
            if (i < len2) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "AKA";
        String word2 = "KUM";
        String ans = mergeAlternately(word1, word2);
        System.out.println(ans);
    }

}