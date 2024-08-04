class Solution {
    public String getKey(String word)
    {
        int[] alpha = new int[27];
        for(char ch: word.toCharArray())
        {
            alpha[(int)ch-96]++;
        }
        word="";
        for(int i=0;i<26;i++)
        {
            if(alpha[i]>0)
            word+=(char)(96+i)+"_"+alpha[i];
        }
        return word;

    }
    public List<List<String>> groupAnagrams(String[] strs) {
     List<List<String>> newList = new ArrayList<>();
     Map<String, List<String>> anagrams = new HashMap<>();
     List<String> anagramList;
     for(String str: strs)
     {
        String key = getKey(str);
        if(anagrams.containsKey(key))
            anagramList= anagrams.get(key);
        else
            anagramList = new ArrayList<>();
        anagramList.add(str);
        anagrams.put(key,anagramList);
     }
     anagrams.forEach((key, value) -> {
        newList.add(value);
     });
     return newList;
    }
}