class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
        return 0;
        if(nums.length==1)
        return nums[0];
        int max_sum=Integer.MIN_VALUE,curr_max_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            curr_max_sum+=nums[i];
            if(curr_max_sum>max_sum)
                max_sum=curr_max_sum;
            if(curr_max_sum<0)
                curr_max_sum=0;    
        }
        return max_sum;
    }
}