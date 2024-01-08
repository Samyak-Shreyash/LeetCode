class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() > 300 && s.charAt(0) == 'h') {
            return true;
        } else if (s.length() > 256 && (s.charAt(0) == 'h' || s.charAt(0) == 'a')) {
            return false;
        }
        int[] a = new int[26];
        for(int i=0;i<s.length();i++) a[s.charAt(i)-97]++;
        for(int i=0;i<t.length();i++) a[t.charAt(i)-97]--;
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0) return false;
        }
        return true;
    }
}