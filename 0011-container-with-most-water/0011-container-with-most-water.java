class Solution {
    public int maxArea(int[] height) {
        int i=0,j =height.length-1, max_area=0,area=0, high;
        while(i<j)
        {
            high= height[i]<height[j]?height[i]:height[j];
            area= high*(j-i);
            max_area=area>max_area?area:max_area;
            while (i < j && height[i] <= high) i++;
            while (i < j && height[j] <= high) j--;
        }
        return max_area;
    }
}