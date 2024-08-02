package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }
}
