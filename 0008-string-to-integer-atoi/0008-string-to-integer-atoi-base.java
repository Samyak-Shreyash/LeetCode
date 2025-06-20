class Solution {
    public int myAtoi(String s) {
        int num=0;
        int sign=1;
        s=s.stripLeading();
        if(s.length()==0) return num;
        char c = s.charAt(0);
        if(c=='-' || c=='+')
        {
           sign= c=='-'?-1:1;
            s=s.substring(1);
        }

        for(char ch: s.toCharArray())
        {
            System.out.print(ch+":");
            if(ch>='0'&&ch<='9'){
                if(sign>0)
                {
                    if(num > (Integer.MAX_VALUE - (ch-'0')) / 10)
                        return Integer.MAX_VALUE;
                }
                else
                {
                    if(-num < (Integer.MIN_VALUE + (ch-'0')) / 10)
                        return Integer.MIN_VALUE;
                }
                num=(num*10)+(int)(ch-'0');
                System.out.println(num);
                }
            else
            return (num*sign);
        }
        return (num*sign);
    }
}