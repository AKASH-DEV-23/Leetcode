package Arrays;

public class MajorityElement_169 {
    public static int majorityElement(int[] nums) {
        int candi = 0;
        int point = 0;
        for (int n : nums) {
            if (point == 0) {
                candi = n;
                point++;
            } else if (candi == n) {
                point++;
            } else {
                point--;
            }
        }
        return candi;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.print(majorityElement(nums));
    }

}
