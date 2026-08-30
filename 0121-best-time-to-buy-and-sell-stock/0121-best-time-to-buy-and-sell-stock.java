class Solution {
    public int maxProfit(int[] prices) {
        // int mx_profit = 0;
        // for(int i = 0; i < prices.length; i++){
        //     int buyPrice = prices[i];
        //     for(int j = i+1; j < prices.length; j++){
        //         int sellPrice = prices[j];
        //         if(sellPrice <= buyPrice)
        //             continue;
        //         else 
        //             mx_profit = Math.max((sellPrice - buyPrice),mx_profit);
        //     }
        // }
        // return mx_profit;


        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            minPrice = Math.min(minPrice,price);
            int profit = price-minPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}