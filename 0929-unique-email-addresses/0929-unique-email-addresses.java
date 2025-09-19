class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for(String email: emails)
        {
            String local=email.split("@")[0];
            if(local.contains("+"))
                local=local.substring(0,local.indexOf("+"));
            unique.add(local.replace(".","")+"@"+email.split("@")[1]);
        }
        return unique.size();
    }
}