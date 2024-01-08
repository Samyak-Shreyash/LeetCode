class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t== null || s.length()!=t.length()) return false;
		char ch;
        int[] alphabet = new int[26];
        for(int i=0;i<s.length();i++)
        {
            alphabet[s.charAt(i)-97]++;
            alphabet[t.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++)
        {
            if(alphabet[i]!=0) return false;
        }
        return true;
    }
}