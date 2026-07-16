class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 1;

        while (sell < prices.length) {
            if (prices[sell] > prices[buy]) {
                profit += prices[sell] - prices[buy];
            }
            buy++;
            sell++;
        }
        return profit;
    }
}
