package Arrays;

public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int n : nums) {
            if (n != val) {
                nums[count] = n;
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int result = removeElement(nums, 3);
        System.out.println(result);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
