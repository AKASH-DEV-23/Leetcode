package Arrays;

public class MergeSortedArray_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 5, 10, 0, 0, 0 };
        int[] nums2 = { 3, 5, 8 };
        merge(nums1, 3, nums2, 3);
        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }
}
