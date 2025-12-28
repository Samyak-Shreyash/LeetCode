class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        String rev="";
        for(char ch: s.toCharArray())
        {
            if((ch>96 && ch<123)||(ch>64 && ch<91)||(ch>47&&ch<58))
            {
                str+=ch;
                rev=ch+rev;
            }
        }
    return (str.equalsIgnoreCase(rev));
        
    }
}