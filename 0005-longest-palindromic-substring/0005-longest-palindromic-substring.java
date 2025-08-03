class Solution {
    public String longestPalindrome(String s) {

        int ps=0,pe=0;
        for(int i=0;i<s.length();i++)
        {
            String wrd=s.charAt(i)+"";
            String rev=wrd;
            int pal_st=i;
            int pal_end=i;
            for(int j=i+1;j<s.length();j++)
            {
                wrd=wrd+s.charAt(j);
                rev=s.charAt(j)+rev;
                if(wrd.equals(rev) && j>pal_end)
                {
                    pal_end=j;
                }
            }
            if(pal_end-pal_st>pe-ps)
            {
                pe=pal_end;
                ps=pal_st;
            }
        }
        return s.substring(ps,pe+1);

        
    }
}