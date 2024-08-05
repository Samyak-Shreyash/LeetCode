class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2)
            return nums.length;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i: nums)
            pq.add(i);
        int ct=1, max_ct=Integer.MIN_VALUE, prev=pq.poll(),curr;
        while(pq.size()>0)
        {
            curr=pq.poll();
            if(curr==prev+1)
                ct++;
            else if(curr==prev);
            else
                {
                    if(max_ct<ct)
                        max_ct=ct;
                    ct=1;
                }
            prev=curr;
        }
        return ct>max_ct?ct:max_ct;
    }
}