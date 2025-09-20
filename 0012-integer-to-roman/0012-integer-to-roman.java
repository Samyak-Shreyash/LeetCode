class Solution {
    public String intToRoman(int num) {

        String numerals="IVXLCDM";
        int i=0;
        String roman ="";
        while(num>0)
        {
            int d=num%10;
            System.out.print(d+"-"+numerals.charAt(i));
            switch(d){
                case 1:
                roman=numerals.charAt(i)+""+roman;
                break;
                case 2:
                roman=numerals.charAt(i)+""+numerals.charAt(i)+""+roman;
                break;
                case 3:
                roman=numerals.charAt(i)+""+numerals.charAt(i)+""+numerals.charAt(i)+""+roman;
                break;
                case 4:
                roman=numerals.charAt(i)+""+numerals.charAt(i+1)+""+roman;
                break;
                case 5:
                roman=numerals.charAt(i+1)+""+roman;
                break;
                case 6:
                roman=numerals.charAt(i+1)+""+numerals.charAt(i)+""+roman;
                break;
                case 7:
                roman=numerals.charAt(i+1)+""+numerals.charAt(i)+""+numerals.charAt(i)+""+roman;
                break;
                case 8:
                roman=numerals.charAt(i+1)+""+numerals.charAt(i)+""+numerals.charAt(i)+""+numerals.charAt(i)+""+roman;
                break;
                case 9:
                roman=(numerals.charAt(i)+""+numerals.charAt(i+2)+""+roman);
                break;
            }
            System.out.println("="+roman);
            num/=10;
            i+=2;
        }
        return roman;
    }
}