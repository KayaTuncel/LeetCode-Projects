public class BuyAndSellStock {
    public int maxProfit(int[] prices) {

        int min_number = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_number) {
                min_number = prices[i];
            } else if (prices[i] - min_number > max_profit) {
                max_profit = prices[i] - min_number;
            }
        }

        return max_profit;
    }

}
