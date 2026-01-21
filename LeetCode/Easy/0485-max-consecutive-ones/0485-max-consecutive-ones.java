class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ct=0,max=0;
        for(int i : nums)
        {
            if(i==0)
            {
                if(ct>max)
                    max=ct;
                ct=-1;
            }

            ct++;
        }
        if(ct>max)
            max=ct;
        return max;
    }
}