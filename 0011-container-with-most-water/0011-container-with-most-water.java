class Solution {
    public int min(int a, int b) {
        return a<b?a:b;
    }
    public int maxArea(int[] height) {
        int i=0,j =height.length-1, max_area=0,area=0;
        while(i<j)
        {
            area= min(height[i],height[j])*(j-i);
            max_area=area>max_area?area:max_area;
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max_area;
    }
}