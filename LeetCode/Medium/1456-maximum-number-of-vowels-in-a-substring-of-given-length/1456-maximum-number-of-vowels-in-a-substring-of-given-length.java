class Solution {
    public int maxVowels(String s, int k) {
        s=s.toLowerCase();
        int i,ct=0,max=0;
        for(i=0;i<k;i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'||ch=='u')
                ct++;
        }
        max=ct;
        for(i=k;i<s.length();i++) {
            char prev = s.charAt(i-k);
            char ch = s.charAt(i);
            if(prev=='a'|| prev=='e' || prev=='i' || prev=='o'||prev=='u')
                ct--;
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'||ch=='u')
                ct++;
            if(ct>max)
                max=ct;
        }
        return max;
    }
}