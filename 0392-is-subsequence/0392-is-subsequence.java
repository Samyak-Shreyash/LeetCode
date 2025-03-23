class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0 && t.length()==0)
        return true;
        if(s.length()>t.length())
        return false;        
        int j=0;
        char ch;
        for(int i=0;j<s.length() && i<t.length();i++)
        {
            ch=s.charAt(j);
            if(ch==t.charAt(i))
                j++;
        }
        return (j==s.length());
            
    }
}