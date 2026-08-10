class Solution {
    public int numIslands(char[][] grid) {

        int m = grid.length;
        boolean[][] visited = new boolean[m][];
        //Directions - left,up,right,down
        for (int i = 0; i < m; i++) {
            visited[i] = new boolean[grid[i].length];
        }
        int[] dx = { 0, -1, 0, 1 };
        int[] dy = { -1, 0, 1, 0 };
        int islands = 0;

        for (int i = 0; i < m; i++) {
            int n = grid[i].length;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    islands++;
                    completeIsland(grid, i, j, m, dx, dy, visited);
                }
            }
        }

        return islands;
    }

    public void completeIsland(char[][] grid, int i, int j, int m, int[] dx, int[] dy, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return;

        if (visited[i][j])
            return;

        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            completeIsland(grid, i + dx[k], j + dy[k],m, dx, dy, visited);
        }
    }

}