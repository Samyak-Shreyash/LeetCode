class Solution {
    public int climbStairs(int n) {
        if(n<3)
            return n;
        int a, b;
        a=1;
        b=2;
        for(int i=2;i<n;i++)
        {
            b=a+b;
            a = b-a;
        }
        return b;
    }
}
