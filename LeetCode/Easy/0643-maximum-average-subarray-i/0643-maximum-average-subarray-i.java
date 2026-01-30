class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0, sum=0,max=0;
        for(i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        max=sum;
        for(i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k];
            if(sum>max)
                max=sum;
        }
        return (double)((double)max/k);

    }
}