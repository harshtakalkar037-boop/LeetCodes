class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int minimum =prices[0];
        for(int i=0;i<n;i++){
            int cost=prices[i]-minimum;
            profit=Math.max(profit,cost);
            minimum=Math.min(minimum,prices[i]);
        }
        return profit;
    }
}