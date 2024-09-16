
package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = { 50, 40, 30, 20, 10 };
        int high = a.length - 1;
        mergeSort(a, 0, high);
        System.out.print(Arrays.toString(a));
    }

    private static void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    private static void merge(int[] a, int low, int mid, int end) {
        int l = mid - low + 1;
        int r = end - mid;
        int[] left_subArray = new int[l];
        int[] right_subArray = new int[r];
        int k = low;
        for (int i = 0; i < l; i++) {
            left_subArray[i] = a[k];
            k++;
        }
        for (int j = 0; j < r; j++) {
            right_subArray[j] = a[k];
            k++;
        }
        int i = 0;
        int j = 0;
        k = low;
        while (i < l && j < r) {
            if (left_subArray[i] <= right_subArray[j]) {
                a[k] = left_subArray[i];
                i++;
            } else {
                a[k] = right_subArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            a[k] = left_subArray[i];
            i++;
            k++;
        }
        while (j < r) {
            a[k] = right_subArray[j];
            j++;
            k++;
        }
    }
}