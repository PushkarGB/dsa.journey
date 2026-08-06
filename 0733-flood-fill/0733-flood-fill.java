class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgColor = image[sr][sc];

        if (orgColor == color)
            return image;

        int[][] directions = {
                { 0, 1 },
                { 1, 0 },
                { -1, 0 },
                { 0, -1 }
        };
        int rows = image.length;
        int cols = image[0].length;
        Deque<int[]> open = new ArrayDeque<>();

        image[sr][sc] = color;
        open.offer(new int[] { sr, sc });

        while (!open.isEmpty()) {
            int[] curr = open.poll();

            for (int[] dxy : directions) {
                int r = curr[0] + dxy[0];
                int c = curr[1] + dxy[1];

                if (r >= 0 && r < rows && c >= 0 && c < cols && image[r][c] == orgColor) {
                    image[r][c] = color;
                    open.offer(new int[] { r, c });
                }
            }
        }
        return image;
    }
}