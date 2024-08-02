package TwoPointers;

import java.util.Arrays;

public class TwoSumII_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[] { low + 1, high + 1 };
            }
            if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        System.out.print(Arrays.toString(twoSum(numbers, 9)));

    }

}
