class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i,j;
        String str="";
        for(i=0,j=0;i<word1.length()&&j<word2.length();i++,j++)
            str+=(""+word1.charAt(i))+word2.charAt(j);
        if(i<word1.length())
            str+=word1.substring(i,word1.length());
        else
            str+=word2.substring(j,word2.length());
        return str;
    }
}