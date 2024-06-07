class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length())
        return false;
        int i=0;
        s=s.toLowerCase();
        for(String word : words)
        {
            word= word.toLowerCase();
            if((word.charAt(0))!=s.charAt(i++))
            return false;
        }
        return true;
    }
}