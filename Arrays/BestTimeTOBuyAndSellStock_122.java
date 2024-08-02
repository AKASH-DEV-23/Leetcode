package Arrays;

public class BestTimeTOBuyAndSellStock_122 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6 };
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
