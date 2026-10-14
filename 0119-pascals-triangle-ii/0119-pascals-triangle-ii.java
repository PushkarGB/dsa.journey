class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        if(rowIndex == 0){
            row.add(1);
            return row;
        }
        int[][] dp = new int[rowIndex+1][];
        for(int i = 0; i < rowIndex+1; i++){
            dp[i] = new int[i+1];
            Arrays.fill(dp[i],-1);
        }
        for(int i = 0; i < rowIndex+1; i++){
            if(i == 0 || i == rowIndex)
                row.add(1);
            else
                row.add(solveP(rowIndex,i,dp));
        }
        return row;
    }

    private int solveP(int r , int c , int[][] dp){

        //System.out.println("checking " + r + " " + c);
        if(r < 0 || c < 0) return 0;
        if(c == 0) return 1;
        if(r == c) return 1;

        if(dp[r][c] != -1) return dp[r][c];

        int a = solveP(r-1,c-1,dp);
        dp[r-1][c-1] = a;
        int b = solveP(r-1,c,dp);
        dp[r-1][c] = b;

        dp[r][c] = a + b;
        return dp[r][c];
    }
}