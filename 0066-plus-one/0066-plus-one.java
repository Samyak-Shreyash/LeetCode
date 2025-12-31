class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length;
        while(i>0)
        {
            i--;
            digits[i]++;
            if(digits[i]>9)
                digits[i]=0;
            else
                break;
        }
        if(digits[0]==0)
        {
            int l = digits.length+1;
            int num[] = new int[l];
            num[0]=1;
            for(i=1;i<l;i++)
            num[i]=digits[i-1];
            return num;
        }
        return digits;
    }
}