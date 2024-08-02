package Arrays;

public class JumpGame_55 {
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                return false;
            } else {
                reachable = Math.max(reachable, i + nums[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 14 };
        System.out.println(canJump(nums));

    }
}
