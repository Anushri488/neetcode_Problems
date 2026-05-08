class Solution {
    public int maxProfit(int[] prices) {
        
        int max_price=0;
        int min_price=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_price){
                min_price=prices[i];
            }
            else{
                int profit=prices[i]-min_price;
                max_price=Math.max(max_price,profit);
            }
        }
        return max_price;
    }
}
