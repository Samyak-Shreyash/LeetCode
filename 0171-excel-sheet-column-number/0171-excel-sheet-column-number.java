class Solution {
    public int titleToNumber(String columnTitle) {
        int ltr,pos=0;
        for(char ch: columnTitle.toCharArray())
        {
            ltr=ch-'A';
            pos=(pos*26)+ltr+1;
        }
        return pos;
    }
}