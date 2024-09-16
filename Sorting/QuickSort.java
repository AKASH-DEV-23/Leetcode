package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = { 90, 80, 70, 60, 50, 40, 30, 20, 10 };
        int high = a.length-1;
        quick(a, 0, high);
        System.out.print(Arrays.toString(a));
    }

    private static void quick(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quick(a, low, pivotIndex - 1);
            quick(a, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int pivotIndex = low;
        for (int i = low; i < high; i++) {
            if (a[i] < pivot) {
                swap(a, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(a, pivotIndex, high);
        return pivotIndex;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
