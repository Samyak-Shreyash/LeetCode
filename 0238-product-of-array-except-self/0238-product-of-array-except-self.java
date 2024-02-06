class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero_Ct =0, product=1;
        int[] ret_arr = new int[nums.length];
        for(int i : nums)
        {
            if(i==0)
            zero_Ct++;
            else
            product*=i;
        }
        if(zero_Ct>1)
            return ret_arr;
        for(int i =0;i<nums.length;i++)
        {
            if(zero_Ct==1) 
            {
                if(nums[i]==0)
                    ret_arr[i]=product;
            }
            else
            ret_arr[i]=product/nums[i];
        }
        return ret_arr;
    }
}