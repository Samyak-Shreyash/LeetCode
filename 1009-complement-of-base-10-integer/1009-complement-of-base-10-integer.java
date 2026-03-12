class Solution {
    private int getNextBinary(int n) {
        
        int p=1;
        while(p<=n)
            p*=2;
        return p-1;
    }
    public int bitwiseComplement(int n) {
        if(n==0)
        return 1;       
        int pw = getNextBinary(n);
        return pw-n;
    }
}