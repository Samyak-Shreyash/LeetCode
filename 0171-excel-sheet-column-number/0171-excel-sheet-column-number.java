class Solution {
    public int titleToNumber(String columnTitle) {
        int pos=0;
        for(char ch: columnTitle.toCharArray())
            pos=(pos*26)+ch-'A'+1;
        return pos;
    }
}