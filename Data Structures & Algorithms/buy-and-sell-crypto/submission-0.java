class Solution {
    public int maxProfit(int[] prices) {
        int minElement = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i< prices.length ; i++) {
            if(minElement >= prices[i])  {
              minElement = prices[i];
            }
            else {
               res = Math.max(res, (prices[i] - minElement));
            }
        }
        return res;
    }
}
