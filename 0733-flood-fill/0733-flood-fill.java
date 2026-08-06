class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //DFS Solution
        int orgColor = image[sr][sc];
        if(orgColor == color) return image;
        int[] dr = {-1,0,1,0}; // up , right , down , left
        int[] dc = {0,1,0,-1};
        image[sr][sc] = color;

        dfs(image,sr,sc,color,orgColor,dr,dc);

        return image;
        
    }

    public void dfs(int[][] image, int sr, int sc, int color,int orgColor,int[] dr,int[] dc){

        int n = image.length;
        int m = image[0].length;

        for(int i = 0; i < dc.length; i++){
            int r = sr+dr[i];
            int c = sc+dc[i];

            if((r>=0) && (r<n) && (c>=0) && (c<m) && image[r][c] == orgColor){
                image[r][c] = color;
                dfs(image,r,c,color,orgColor,dr,dc);
            }
        }
    }
}