class Solution {
    public int majorityElement(int[] nums) {
       int ct=0,v=nums[0];
       for(int i=0;i<nums.length;i++)
       {
        if(ct==0)
            v=nums[i];
        if(v==nums[i])
            ct++;
        else
            ct--;
       }
       return v;
    }
}