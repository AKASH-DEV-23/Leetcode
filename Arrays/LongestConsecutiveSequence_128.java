package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence_128 {
    public static int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, true);
        }
        for (int num : nums) {
            if (map.containsKey(num - 1)) {
                map.put(num, false);
            }
        }
        int maxLength = 0;
        for (int num : nums) {
            if (map.get(num) == true) {
                int length = 1;
                while (map.containsKey(num + length)) {
                    length++;
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println(longestConsecutive(nums));
    }
}
