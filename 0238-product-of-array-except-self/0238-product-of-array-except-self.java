class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero_Ct =0, product=1;
        int[] answer = new int[nums.length];
        for(int i : nums)
        {
            if(i==0)
            zero_Ct++;
            else
            product*=i;
        }
        if(zero_Ct>1)
            return answer;
        for(int i =0;i<nums.length;i++)
        {
            if(zero_Ct==1) 
            {
                if(nums[i]==0)
                    answer[i]=product;
            }
            else
            answer[i]=product/nums[i];
        }
        return answer;
    }
}