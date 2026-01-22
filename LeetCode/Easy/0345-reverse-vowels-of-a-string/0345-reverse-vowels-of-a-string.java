class Solution {
    public boolean isVowel(char ch){
        switch (Character.toLowerCase(ch))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
            
    }
    public String reverseVowels(String s) {
        int i=0, l=s.length();
        int j=l-1;
        StringBuilder sb = new StringBuilder(s);
        while(i<j)
        {
            while(i<j&& !(isVowel(sb.charAt(i))))
                i++;
            while(j>i && !(isVowel(sb.charAt(j))))
                j--;
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            // System.out.println(sb+" "+i+" "+j);
            i++;
            j--;
        }
        return sb.toString();
    }
}