class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] num = new int[n*2];
        int i, k=0;
        for(i=0;i<n;i++)
        {
            num[k++]=nums[i];
            num[k++]=nums[n+i];
        }
        return num;
    }
}