class Solution {
    public boolean isAnagram(String s, String t) {
        int[] feq = new int[26];
        for(int i=0;i<s.length();i++) feq[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++) feq[t.charAt(i)-'a']--;
        for(int i=0;i<26;i++)
        {
            if(feq[i]!=0) return false;
        }
        return true;
    }
}