package Arrays;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 8, 7, 9 };
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
