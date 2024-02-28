class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        // int[] alpha = new int[26];
        int alpha=0;
        for(char ch='a';ch<='z';ch++)
            if(sentence.indexOf(ch)==-1) return false;
        return true;
    }
}