class Solution {
    public int minPathSum(int[][] grid) {
        int i,j, m = grid.length, n = grid[0].length;
        int cost[][] =new int[m][n];
        cost[0][0]=grid[0][0];
        for(i=1;i<m;i++)
        {
            cost[i][0]=grid[i][0]+cost[i-1][0];
        }
        for(j=1;j<n;j++)
        {
            cost[0][j]=grid[0][j]+cost[0][j-1];
        }
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                cost[i][j]=grid[i][j]+(cost[i-1][j]<cost[i][j-1]?cost[i-1][j]:cost[i][j-1]);
            }
            
        }
        return cost[i-1][j-1];
    }
}