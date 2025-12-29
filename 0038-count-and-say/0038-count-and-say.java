class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        String str = countAndSay(n-1);
        // System.out.println("prev "+str);
        String newStr="";
        for(int i=0;i<str.length();)
        {
            int ct=1;
            char ch = str.charAt(i);
            while(i+ct<str.length() && ch==str.charAt(i+ct))
            {
                // System.out.print(ch+" "+str.charAt(i+ct)+"-");
                ct++;
            }
            i+=ct;
            newStr = newStr+String.valueOf(ct)+ch;
            // System.out.println("~"+newStr);
        }
        return newStr;
    }
}