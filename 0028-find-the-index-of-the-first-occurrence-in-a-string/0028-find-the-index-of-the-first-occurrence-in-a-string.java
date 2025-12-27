class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(haystack))
            return 0;
        char sc= needle.charAt(0);
        int sl = needle.length();
        for(int i =0;i< haystack.length();i++)
        {
            if(haystack.charAt(i)==sc && i+sl-1<haystack.length() && needle.equals(haystack.substring(i,i+sl)))
            return i;
        }
        return -1;
    }
}