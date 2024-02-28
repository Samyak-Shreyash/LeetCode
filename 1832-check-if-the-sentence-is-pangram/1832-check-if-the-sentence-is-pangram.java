class Solution {
    public boolean checkIfPangram(String sentence) {
        // if(sentence.length()<26) return false;
        int[] alpha = new int[26];
        for(char ch : sentence.toCharArray())
            alpha[ch-'a']++;
        for(int i: alpha)
            if(i==0) return false;
        return true;
    }
}