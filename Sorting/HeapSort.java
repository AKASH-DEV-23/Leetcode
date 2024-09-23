package Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] a = { 2, 1, 5, 4, 3, 7, 6 };
        int n = a.length;
        heapSort(a, n);
        System.out.println(Arrays.toString(a));
    }

    private static void heapSort(int[] a, int n) {
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(a, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i >= 0; i--) {
            swap(a, 0, i); // Swap root with last element
            maxHeapify(a, i, 0); // Heapify reduced heap
        }
    }

    private static void maxHeapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;

        if (l < n && a[largest] < a[l]) {
            largest = l;
        }

        if (r < n && a[largest] < a[r]) {
            largest = r;
        }

        if (largest != i) {
            swap(a, largest, i);
            maxHeapify(a, n, largest);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
