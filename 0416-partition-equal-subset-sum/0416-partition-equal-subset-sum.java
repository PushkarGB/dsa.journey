class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        if(totalSum % 2 != 0) return false;

        int target = totalSum/2;
        int n = nums.length;
        int[][] dp = new int[n][target+1];

        for(int[] row : dp){
            Arrays.fill(row,-1);
        }

        return solve(nums,n-1,target,dp);
    }

    private boolean solve(int[] arr,int i,int remainingTarget,int[][] dp){
        if(remainingTarget == 0) return true;

        if(i == 0) return arr[0] == remainingTarget;
    
        if(dp[i][remainingTarget] != -1) return (dp[i][remainingTarget] == 0) ? false : true;

        boolean notTake = solve(arr,i-1,remainingTarget,dp);

        boolean take = false;
        if(arr[i] <= remainingTarget){
            take = solve(arr,i-1,remainingTarget - arr[i],dp);
        }

        dp[i][remainingTarget] = (take || notTake) ?  1 : 0;
        
        return (take || notTake);
    }
}