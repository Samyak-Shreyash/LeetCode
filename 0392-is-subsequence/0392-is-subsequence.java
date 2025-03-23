class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0 && t.length()==0)
            return true;
        if(s.length()>t.length())
            return false;        
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        int j=0;
        for(int i=0;j<s_arr.length && i<t_arr.length;i++)
        {
            if(t_arr[i]==s_arr[j])
                j++;
        }
        return (j==s_arr.length);
            
    }
}