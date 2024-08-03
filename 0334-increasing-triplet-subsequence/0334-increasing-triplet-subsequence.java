class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a= Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<a)
                a=nums[i];
            if(nums[i]>a && nums[i]<b)
                b=nums[i];
            if(nums[i]>a && nums[i]>b)
                return true;
        }
        return false;
    }
}