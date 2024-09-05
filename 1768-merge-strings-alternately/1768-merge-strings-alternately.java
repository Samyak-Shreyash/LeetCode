class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i,j,l1=word1.length(),l2=word2.length();
        StringBuilder str = new StringBuilder();
        for(i=0,j=0;i<l1&&j<l2;i++,j++)
            str.append(word1.charAt(i)).append(word2.charAt(j));
        if(i<l1)
            str.append(word1.substring(i,l1));
        else
            str.append(word2.substring(j,l2));
        return str.toString();
    }
}