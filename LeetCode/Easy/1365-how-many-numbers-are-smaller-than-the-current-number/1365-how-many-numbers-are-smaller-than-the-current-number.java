class Solution {
    
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sort = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            int ct=0;
            for(int j=0;j<nums.length;j++) {
                if(nums[i]>nums[j])
                    ct++;
            }
            sort[i]=ct;   
        }
        return sort;
    }
}