package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 6, 8 };
        int[] result = countSort(arr);
        System.out.println(Arrays.toString(result));

    }

    private static int[] countSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            count[value]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int value = arr[i];
            int countValue = --count[value];
            result[countValue] = arr[i];
        }
        return result;

    }
}
