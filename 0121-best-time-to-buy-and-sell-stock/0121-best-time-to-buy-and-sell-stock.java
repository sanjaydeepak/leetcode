class Solution {
    public int maxProfit(int[] prices) {
        int cost;
        int profit=0;
        int minimum=prices[0];
        // Here the loop starts from 1 because the given array with high cost so it starts from index at 1;
        for(int i=1;i<prices.length;i++)
        {
            cost=prices[i]-minimum;
            profit=Math.max(cost,profit);// to Store the maximum value for it to show the profit 
            minimum=Math.min(minimum,prices[i]);// Use's Dp for Memory Updation//
        }
        return profit;
    }
}