class Solution {
    public int maxArea(int[] height) {
        int i=0,j =height.length-1, max_area=0,area=0, high;
        while(i<j){
        high = height[i]<height[j]?height[i]:height[j];
        area= (j-i)*high;
        max_area=max_area>area?max_area:area;
        if(height[i]<height[j])
        i++;
        else 
        j--;
        }
        return max_area;
    }
}