class Solution {
    public int titleToNumber(String columnTitle) {
        int pos=0;
        for(int i=0;i<columnTitle.length();i++)
            pos=(pos*26)+columnTitle.charAt(i)-'A'+1;
        return pos;
    }
}