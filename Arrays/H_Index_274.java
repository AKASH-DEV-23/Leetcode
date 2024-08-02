package Arrays;

public class H_Index_274 {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n + 1];
        for (int c : citations) {
            if (c > n) {
                arr[n]++;
            } else {
                arr[c]++;
            }
        }
        int sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += arr[i];
            if (sum >= i) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] citations = { 3, 0, 6, 1, 5 };
        System.out.println(hIndex(citations));
    }
}
