class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i;
        List<Integer> result = new ArrayList();
        for(i=0;i<nums.length;i++)
        {
            int x = Math.abs(nums[i]);
            nums[x-1]=Math.abs(nums[x-1])*-1;
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                result.add(i+1);
        }
        return result;
    }
}