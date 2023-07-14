class Solution {
    public int maxProfit(int[] prices) {
        int oldPrices = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<oldPrices){
                oldPrices = prices[i];
            }
            else{
                profit +=prices[i]-oldPrices;
                oldPrices = prices[i];
            }
        }
        return profit;
    }
}