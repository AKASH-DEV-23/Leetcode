package Arrays;
public class BestTimeToBuyAndSellStock_121 {
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int num : prices) {
            if (num < buyPrice) {
                buyPrice = num;
            } else {
                int currentProfit = num - buyPrice;
                profit = Math.max(currentProfit, profit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}