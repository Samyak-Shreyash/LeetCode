class Solution {
    public boolean increasingOrder(int[] nums, int pos, int rem)
    {
        // System.out.print(nums[pos]+" ");
        if(rem==0)
            return true;
        for(int i=pos+1;i<=nums.length-rem;i++)
        {
            if(nums[i]>nums[pos])
                if(increasingOrder(nums,i,rem-1))
                    return true;
        }
        return false;
    }
    public boolean increasingTriplet(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            if(increasingOrder(nums,i,2))
                return true;      
        }
        return false;
    }
}