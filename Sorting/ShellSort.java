package Sorting;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] a = { 20, 10, 30, 50, 40, 60, 80, 70 };
        int n = a.length;
        shell(a, n);
        System.out.print(Arrays.toString(a));
    }

    private static void shell(int[] a, int n) {
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (a[i] < a[i + gap]) {
                        break;
                    } else {
                        int temp = a[i];
                        a[i] = a[i + gap];
                        a[i + gap] = temp;
                    }
                }
            }
        }
    }
}
