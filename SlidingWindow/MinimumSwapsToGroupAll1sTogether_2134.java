package SlidingWindow;

public class MinimumSwapsToGroupAll1sTogether_2134 {
    public static int minSwaps(int[] nums) {
        int countOnes = 0;
        for (int n : nums) {
            if (n == 1) {
                countOnes++;
            }
        }
        int i = 0;
        int j = 0;
        int currCount = 0;
        int maxCount = 0;
        int n = nums.length;
        while (j < 2 * n) {
            if (nums[j % n] == 1) {
                currCount++;
            }
            if (j - i + 1 > countOnes) {
                currCount -= nums[i % n];
                i++;
            }
            maxCount = Math.max(currCount, maxCount);
            j++;
        }
        return countOnes - maxCount;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(minSwaps(nums));
    }
}
