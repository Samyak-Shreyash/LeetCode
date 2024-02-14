class Solution {
    public static int get_gcd(int gt_num, int ls_num)
    {
        int rem=1;
        while(gt_num>ls_num) 
        {
            rem=gt_num%ls_num;
            if(rem==0)
                break;
            gt_num=ls_num;
            ls_num=rem;
        }
        return ls_num;
    }
    public int findGCD(int[] nums) {
        int min=nums[0], max=nums[0];
        for(int n : nums)
        {
            if(n<min)
                min=n;
            if(n>max)
                max=n;
        }
        return get_gcd(max, min);
    }
}