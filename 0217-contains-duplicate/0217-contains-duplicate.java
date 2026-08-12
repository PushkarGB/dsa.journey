class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> occured = new HashSet<>();
        for(int i : nums){
            if(occured.contains(i)) return true;
            else occured.add(i);
        }
        return false;
    }
}