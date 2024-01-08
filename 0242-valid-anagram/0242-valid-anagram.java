class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t== null || s.length()!=t.length()) return false;
			char[] str = s.toCharArray();
			Arrays.sort(str);
			char[] ana = t.toCharArray();
			Arrays.sort(ana);
			for(int i=0;i<str.length;i++)
			{
				if(str[i]!=ana[i])
				return false;
			}
			return true;	
    }
}