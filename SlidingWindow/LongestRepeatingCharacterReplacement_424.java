package SlidingWindow;

public class LongestRepeatingCharacterReplacement_424 {
    public static int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        char[] ans = s.toCharArray();
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;
        for (int right = 0; right < ans.length; right++) {
            arr[ans[right] - 'A']++;
            maxCount = Math.max(maxCount, arr[ans[right] - 'A']);
            while ((right - left + 1) - maxCount > k) {
                arr[ans[left++] - 'A']--;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        System.out.println(characterReplacement(s, 2));
        
    }
}
