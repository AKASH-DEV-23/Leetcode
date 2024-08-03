package Arrays;

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubarrays_1460 {
  public static boolean canBeEqual(int[] target, int[] arr) {
    Arrays.sort(target);
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      if (target[i] != arr[i]) {
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {
    int[] target = { 1, 2, 3, 4 };
    int[] arr = { 2, 1, 4, 3 };
    System.out.println(canBeEqual(target, arr));
  }
}