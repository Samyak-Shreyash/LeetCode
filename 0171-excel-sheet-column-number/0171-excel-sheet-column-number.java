class Solution {
    public int titleToNumber(String s) {
        int p=0;
        for(int i=0;i<s.length();i++)
            p=(p*26)+s.charAt(i)-'A'+1;
        return p;
    }
}