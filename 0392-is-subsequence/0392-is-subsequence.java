class Solution {
    public boolean isSubsequence(String s, String t) {
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