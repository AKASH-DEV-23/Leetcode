package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {11,2,3,40,15};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubble(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n-1; j++) {
                if (a[j] > a[j + 1]) {
                    flag = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
