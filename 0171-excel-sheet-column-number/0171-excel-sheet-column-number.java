class Solution {
    public int titleToNumber(String s) {
        int pos=0;
        for(int i=0;i<s.lrngth();i++)
            pos=(pos*26)+s.charAt(i)-'A'+1;
        return pos;
    }
}