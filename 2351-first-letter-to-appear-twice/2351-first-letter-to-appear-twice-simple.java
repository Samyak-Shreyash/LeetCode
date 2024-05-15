class Solution {
    public char repeatedCharacter(String s) {
        List<Character> chars = new ArrayList<>();
        for(char ch : s.toCharArray())
        {
            if(chars.contains(ch))
            return ch;
            chars.add(ch);
        }
        return s.charAt(0);
    }
}