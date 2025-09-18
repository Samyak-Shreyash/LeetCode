class Solution {
    public int rob(int[] num) {
        int l = num.length;
        if(l<2)
            return num[0];
        if(l>2)
            num[2]=num[0]+num[2];
        int i=2;
        while(++i<l)
        {
            num[i]+=(num[i-2]>num[i-3]?num[i-2]:num[i-3]);
        }
        return num[l-1]>num[l-2]?num[l-1]:num[l-2];
        
    }
}