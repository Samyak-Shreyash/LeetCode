class Solution {
   public int minCostClimbingStairs(int[] cost) {
    int dp[] = new int[3], i;
    dp[0]=cost[0];
    dp[1]=cost[1];
    for(i=2;i<cost.length;i++)
    {
        dp[2] = cost[i] + (dp[0]<dp[1]?dp[0]:dp[1]);
        dp[0]=dp[1];
        dp[1]= dp[2];
    }
    return (dp[0]<dp[1]?dp[0]:dp[1]);
    }
}