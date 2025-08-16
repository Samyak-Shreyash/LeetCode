class Solution {
    public int majorityElement(int[] nums) {
       int ct=0,v=nums[0];
       for(int i: nums)
       {
        if(v==i)
            ct++;
        else
            ct--;
        if(ct<0)
        {
            v=i;
            ct=0;
        }
       }
       return v;
    }
}