class Solution {
    public int mySqrt(int x) {
            if(x ==0 || x== 1)
            return x;
        int l=x;
        while ((long)(l * l) > x || (l * l) / l != l) {
            l = l / 2;
        }
        int r=l*2,m=l;
        if(m*m<=x && (m+1)*(m+1)>x)
            return m;
        while(r>l)
        {
            m=(l+r)/2;
            if(m<=x/m && (long)(m+1)*(m+1)>x)
                return m;
            else if((long)m*m<x)
            {    
                l=m+1;
                m=l;
            }
            else
            {
                r=m-1;
                m=r;
                }
            }
        return m;
        }
}