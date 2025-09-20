class Solution {
    public static final String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static final Integer[] nums={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    int i=0;
    public String intToRoman(int num) {
        String roman="";
        while(num>0 || i>nums.length)
        {
            int d= num/nums[i];
            while(d-->0)
                roman+=romans[i];
            num%=nums[i];
            i++;
        }
        return roman;
    }
}