package Arrays;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            } else {
                ans.append(first[i]);
            }
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }
}
