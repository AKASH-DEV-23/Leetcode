package Arrays;

public class ValidAnagram_242 {
    public static boolean isAnagram(String s, String t) {
        int count[] = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        System.out.println(isAnagram(s, t));

    }
}
