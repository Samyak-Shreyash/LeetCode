class Solution {
    public int titleToNumber(String cT) {
        int pos=0;
        for(char ch: cT.toCharArray())
            pos=(pos*26)+ch-'A'+1;
        return pos;
    }
}