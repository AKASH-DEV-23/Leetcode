package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = { 50, 40, 30, 20, 10 };
        insertion(a);
        System.out.println(Arrays.toString(a));
    }

    private static void insertion(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

}
