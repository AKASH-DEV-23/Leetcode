package Arrays;

public class RemoveDuplicatesFromSortedArray_26 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (count < 1 || n != nums[count - 1]) {
                nums[count] = n;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}