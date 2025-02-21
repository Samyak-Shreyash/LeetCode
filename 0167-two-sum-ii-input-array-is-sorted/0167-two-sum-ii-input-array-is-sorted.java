class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1,sum=numbers[l]+numbers[r];
        while(l<r && sum != target)
        {
            if(sum<target)
                l+=1;
            else
                r-=1;
            sum=numbers[l]+numbers[r];
        }
        if(l<r){
            int[] arr = {l+1, r+1};
            return arr;
        }else
            return numbers;
    }
}