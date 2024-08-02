package BinarySearch;

public class SearchA2DMatrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] num : matrix) {
            for (int n : num) {
                if (target == n) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(searchMatrix(matrix, 3));
    }
}
