class Solution {
    public boolean isAnagram(String s, String t) {
        int[] feq = new int[26];
        for(char ch: s.toCharArray()) feq[ch-'a']++;
        for(char ch: t.toCharArray()) feq[ch-'a']--;
        for(int i:feq)
        {
            if(i!=0) return false;
        }
        return true;
    }
}