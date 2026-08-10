class Solution {
    public int maxProfit(int[] prices) {
        int prof=0;
        int maxprof=0;
        int minval=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            minval=Math.min(minval,prices[i]);
            prof=prices[i]-minval;
            maxprof=Math.max(prof,maxprof);
        }
        return maxprof;
    }
}