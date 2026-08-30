class Solution {
    public void moveZeroes(int[] nums) {
        int nz = -1;
        if(nums.length < 2) return;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0) {
                nums[++nz] = nums[i];
            }
        }
        for(int i = nz+1; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}