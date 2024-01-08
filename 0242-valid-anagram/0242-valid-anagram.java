class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t== null || s.length()!=t.length()) return false;
			Map<Character, Integer> charMap = new HashMap<>();
			int i=0, c=1;
			Character ch;
			for(i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				charMap.put(ch, (charMap.getOrDefault(ch,0)+1));
			}
			for(i=0;i<t.length();i++)
			{
				ch=t.charAt(i);
				c=charMap.getOrDefault(ch, 0)-1;
				if(c<0) return false;
				else if(c==0) charMap.remove(ch);
				else
				charMap.put(ch, c);			
			}
			return (charMap.size()==0);
    }
}