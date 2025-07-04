class Solution {
   public int minCostClimbingStairs(int[] cost) {
    int p1,p2,curr, i;
    p1=cost[0];
    p2=cost[1];
    for(i=2;i<cost.length;i++)
    {
        curr = cost[i] + (p1<p2?p1:p2);
        p1=p2;
        p2= curr;
    }
    return (p1<p2?p1:p2);
    }
}