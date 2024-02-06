class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> vals = new HashMap<>();
        int i,j;
        for(i =0;i<nums.length;i++)
        vals.put(nums[i],i);
        for(i=0;i<nums.length;i++)
        {
        j=target-nums[i];
           if(vals.containsKey(j) && i!=vals.get(j))
            return new int[]{i,vals.get(j)};
        }

        return new int[]{0,1};
    }
}