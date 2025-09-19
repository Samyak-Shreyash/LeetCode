class Solution {
    public String actualEmail(String local, String domain)
    {
        String s ="";
        for(char ch : local.toCharArray())
        {
            if(ch=='+')
                return s+"@"+domain;
            if(ch!='.')
                s+=ch+"";
        }
        return s+"@"+domain;
    }
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(int i=0;i<emails.length;i++)
        {
            String[] email = emails[i].split("@");
            uniqueEmails.add(actualEmail(email[0],email[1]));   
        }
        return uniqueEmails.size();
    }
}