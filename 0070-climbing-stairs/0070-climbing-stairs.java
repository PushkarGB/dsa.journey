class Solution {
    /*
    //Memorization
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
    */
    /*
    //Tabulation
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    */
    // Fibonacci
     public int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 1;
        int curr;
        for(int i = 2; i <=n; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}