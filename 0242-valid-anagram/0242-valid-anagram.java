class Solution {
    public boolean isAnagram(String s, String t) {
        int[] feq = new int[26];
        for(var c : s.toCharacterArray()) feq[c-'a']++;
        for(var c : s.toCharacterArray()) feq[c-'a']--;
        for(int i=0;i<26;i++)
        {
            if(feq[i]!=0) return false;
        }
        return true;
    }
}