class Solution {
    public int search(int[] nums, int target) {
        int lo=0, hi=nums.length-1, mid;
        while(lo<=hi)
        {
            mid = (lo+hi)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
            lo=mid+1;
            else
            hi=mid-1;
        }
        return -1;
        
    }
}