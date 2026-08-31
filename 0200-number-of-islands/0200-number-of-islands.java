class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int island = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    coverLand(grid,i,j,m,n);
                    island++;
                }
            }
        }

        return island;
    }

    private void coverLand(char[][] grid,int r,int c,int m,int n){
        
        if(r < 0 || r >= m || c < 0 || c >= n)
            return;

        if(grid[r][c] == '0')
            return;
        
        grid[r][c] = '0';
        coverLand(grid,r-1,c,m,n); //Up
        coverLand(grid,r+1,c,m,n); //Down
        coverLand(grid,r,c+1,m,n); //Right
        coverLand(grid,r,c-1,m,n); //Left
    }
}