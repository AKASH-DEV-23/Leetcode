package Arrays;
public class ReverseWordsInString_151 {
    public static String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder ans = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            ans.append(" ");
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        String s = "  The sky  is   blue";
        System.out.println(reverseWords(s));
    }
}
