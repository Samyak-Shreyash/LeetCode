class Solution {
    public boolean containsDuplicate(int[] arr) {
        Set<Integer> tempArr = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!tempArr.add(arr[i]))
                return true;
        }
        return false;
    }
}