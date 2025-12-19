class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0],max_profit=0, max_profit_sum=0;
       for(int i=1;i<prices.length;i++)
       {
        if(min>prices[i])
            min=prices[i];
        if(prices[i]-min>max_profit)
            max_profit=prices[i]-min;
        
        // System.out.println("Price: "+prices[i]+" min: "+min+" max_profit: "+max_profit+" sum->"+max_profit_sum);
        if(prices[i]<prices[i-1])
        {
            max_profit_sum+=max_profit;
            max_profit=0;
            min=prices[i];
        }
        else if(i==prices.length-1)
        {
            max_profit_sum+=max_profit;
            max_profit=0;
        }
       } 
       return max_profit_sum;
    }
}