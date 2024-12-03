class Solution {
    public int compress(char[] chars) {
        int l = chars.length;
        if(l<2)
            return l;
        int i=0,j=1,k=i;
        while(i<l)
        {
        j=1;
        String temp ="";
        if(k<l)
            chars[k]=chars[i];
        k++;
        while((i+j)<l && chars[i+j]==chars[i])
            {
                ++j;
            }
            temp=j+"";
            i+=j;
            if(j>1){
                for(int d= 0;k<l&&d<temp.length();d++,k++)
                {
                    chars[k]=temp.charAt(d);
                }
            }
        System.out.println(chars);
        }
        return k;
    }
}