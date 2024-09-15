package Arrays;
public class SuperEggDrop_887 {
    // Function to get the minimum number of trials needed in worst case with n eggs and k floors
    static int eggDrop(int n, int k) {
        // A 2D table where entry dp[i][j] will represent minimum number of trials needed for i eggs and j floors
        int[][] dp = new int[n + 1][k + 1];

        // We need one trial for one floor and zero trials for zero floors
        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;
            dp[i][0] = 0;
        }

        // We always need j trials for one egg and j floors
        for (int j = 1; j <= k; j++) {
            dp[1][j] = j;
        }

        // Fill the rest of the entries in the table using optimal substructure property
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    int res = 1 + Math.max(dp[i - 1][x - 1], dp[i][j - x]);
                    if (res < dp[i][j]) {
                        dp[i][j] = res;
                    }
                }
            }
        }

        // dp[n][k] holds the result
        return dp[n][k];
    }

    // Driver program to test the function
    public static void main(String[] args) {
        int n = 6, k = 2;
        System.out.println("Minimum number of trials in worst case with " + n + " eggs and " + k + " floors is " + eggDrop(n, k));
    }
}
