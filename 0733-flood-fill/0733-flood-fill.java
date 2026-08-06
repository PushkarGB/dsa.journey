class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //DFS Solution
        int orgColor = image[sr][sc];
        if(orgColor == color) return image;
        int[] dr = {-1,0,1,0}; // up , right , down , left
        int[] dc = {0,1,0,-1};

        dfs(image,sr,sc,color,orgColor,dr,dc);

        return image;
        
    }

    public void dfs(int[][] image, int sr, int sc, int color,int orgColor,int[] dr,int[] dc){

        int n = image.length;
        int m = image[0].length;

        if (sr < 0 || sr >= n || sc < 0 || sc >= m)
        return;

        if (image[sr][sc] != orgColor)
        return;

        image[sr][sc] = color;

        // Explore neighbours
        for (int i = 0; i < 4; i++) {
            dfs(image,sr + dr[i],sc + dc[i],color,orgColor,dr,dc);
        }
    }
}