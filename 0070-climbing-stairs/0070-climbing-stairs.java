class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i = 0; i<n+1; i++){
            dp[i] = -1;
        }
        int ans = ways(n,dp);
        return ans;
    }

    public int ways(int n,int[] dp){
        if(n==0)
            return 1;
        
        if(n<0)
            return 0;
        
        if(dp[n]!=-1)
            return dp[n];
        
        dp[n] = ways(n-1,dp) + ways(n-2,dp);

        return dp[n];
    }
}