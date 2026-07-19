class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 1) return 1;

                
        int n = nums.length;
        int lastUniq = 0 , curr = 1;

        while(curr<n){
            /*if current value is different than last unique then add it to unqiue port */
            if(nums[curr] != nums[lastUniq]){
                lastUniq++;
                nums[lastUniq] = nums[curr];
            }
            curr++; // just skip if same;
        }

        return lastUniq+1;
    }
}