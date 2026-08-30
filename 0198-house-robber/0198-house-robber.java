class Solution {
    // public int rob(int[] nums) {
    //     return best(nums.length-1,nums);        
    // }

    // private int best(int i,int[] nums){
    //     if(i<0)
    //         return 0;
    //     if(i==0)
    //         return nums[i];
        
    //     return Math.max(
    //         best(i-1,nums),
    //         nums[i] + best(i-2,nums)
    //     );
    // }

    //Added memorization
        public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        for(int i = 0; i <= nums.length; i++)
            dp[i] = -1;
        return best(nums.length-1,nums,dp);        
    }

    private int best(int i,int[] nums,int[] dp){
        if(i<0)
            return 0;
        if(i==0)
            return nums[i];
        if(dp[i]!=-1)
            return dp[i];
        
        dp[i] = Math.max(
            best(i-1,nums,dp),
            nums[i] + best(i-2,nums,dp)
        );

        return dp[i];
    }
}