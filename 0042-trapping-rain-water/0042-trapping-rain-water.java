class Solution {
    public int trap(int[] height) {
        int i, left_pt=0, right_pt=height.length-1, water=0,max_left =height[left_pt],max_rt=height[right_pt];
        for(i=1;i<height.length-1;i++)
        {
            if(height[right_pt]<height[left_pt])
            max_rt=max_rt>height[--right_pt]?max_rt:height[right_pt];
            else
            max_left=max_left>height[++left_pt]?max_left:height[left_pt];
            water+= height[i]<max_left&& height[i]<max_rt?(max_left>max_rt?max_rt:max_left):height[i];
            water-=height[i];
        }
        return water;
    }
}