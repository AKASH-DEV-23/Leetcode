package Arrays;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElement_347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] ans = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    ans[idx++] = num;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int[] ans = topKFrequent(nums, 2);
        System.out.println(Arrays.toString(ans));

    }
}
