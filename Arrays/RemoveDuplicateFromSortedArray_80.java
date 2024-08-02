package Arrays;

public class RemoveDuplicateFromSortedArray_80 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (count < 2 || n != nums[count - 2]) {
                nums[count] = n;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println(removeDuplicates(nums));
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
