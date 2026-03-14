class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min)
            min = prices[i];

             if(prices[i]-min>profit) //profit = selling price - buying price.This calculates the profit if we sell today.
            profit = prices[i]-min;
        }
        return profit;
    }
}