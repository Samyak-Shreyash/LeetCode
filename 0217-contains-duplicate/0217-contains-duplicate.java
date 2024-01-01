class Solution {
    public boolean containsDuplicate(int[] arr) {
        Set<Integer> trialSet = new HashSet<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
       return !(trialSet.size()==arr.length);
    }
}