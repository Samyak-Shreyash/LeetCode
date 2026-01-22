class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length,miss=n,rpt=nums[0];
        int[] num = new int[n];
        for(int i: nums)
        {
            if(num[i-1]!=0)
                rpt=i;
            else
                num[i-1]=1;
        }
        for(int i=0;i<n;i++)
        {
            if(num[i]==0)
                miss=i+1;
        }
        return new int[]{rpt,miss};
    }
}