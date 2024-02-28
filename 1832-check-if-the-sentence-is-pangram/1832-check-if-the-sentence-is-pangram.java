class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        // int[] alpha = new int[26];
        int alpha=0;
        for(char ch : sentence.toCharArray())
            alpha = (1<< (ch-'a')| alpha);
        return alpha==(1<<26) -1;
    }
}