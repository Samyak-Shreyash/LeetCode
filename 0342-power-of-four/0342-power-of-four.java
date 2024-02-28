class Solution {
    public boolean isPowerOfFour(int n) {
       return (n==1)||(n%4==0 && (n-1)%3==0);

    }
}