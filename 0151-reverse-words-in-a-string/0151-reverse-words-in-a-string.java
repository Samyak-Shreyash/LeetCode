class Solution {
    public String reverseWords(String s) {
        //s=s.trim();
        String[] sent = s.split(" ");
        String sentence = "";
        for(int i=sent.length-1;i>=0;i--)
        {
        
            sent[i]=sent[i].trim();
            if(sent[i].length()>0){
            if(i==sent.length-1){
            sentence+=sent[i];}
            else{
                sentence+=" ";
                sentence+=sent[i];
            }
            }

            /*if(!sent[i].equals(" "))
            {
                sentence+=sent[i];
            if(i!=0)
            sentence+=" ";
        }*/
        }
        return sentence;
    }
}