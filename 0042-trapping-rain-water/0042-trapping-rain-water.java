class Solution {
    public int trap(int[] height) {
        
        if(height==null || height.length<3)
            return 0;
        int i, l = height.length, water=0, level = 0;
        int[] leftInc = new int[l];
        int[] rightInc = new int[l];
        leftInc[0]= height[0];
        for(i=1;i<l;i++)
        {
            leftInc[i]=height[i]>leftInc[i-1]?height[i]:leftInc[i-1];
        }
        
        rightInc[l-1]= height[l-1];
        for(i=l-2;i>=0;i--)
        {
            rightInc[i]=height[i]>rightInc[i+1]?height[i]:rightInc[i+1];
        }
        for(i=0;i<l;i++)
        {    
            level=leftInc[i]<rightInc[i]?leftInc[i]:rightInc[i];
            water+=level>height[i]?level-height[i]:0;
        }
        return water;
    }
}