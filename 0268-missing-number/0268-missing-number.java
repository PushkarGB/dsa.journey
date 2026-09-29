class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sum = 0; 
        // for(int i : nums){
        //     sum+=i;
        // }
        // return (n*(n+1)/2)-sum;
        int xor1 = 0, xor2 = 0;
        for(int i = 0; i < nums.length; i++){
            xor1 = xor1^(i+1);
            xor2 = xor2^nums[i];
        }
        return (xor1^xor2);
    }
}