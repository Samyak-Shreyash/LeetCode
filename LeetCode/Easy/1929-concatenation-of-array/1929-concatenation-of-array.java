class Solution {
    public int[] getConcatenation(int[] nums) {
        int i=0, l = nums.length;
        int[] ans = new int[2*l];
        for( int n : nums){
            ans[i+l] = n;
            ans[i++] = n;
            }
        
        return ans;
    }
}