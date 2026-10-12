class Solution {
    public int orangesRotting(int[][] grid) {

        /*
        int m = grid.length;
        int steps = 0;
        boolean success = false , found = false;

        System.out.println("Inital Grid : ");
        
        for(int i = 0; i < m; i++){
            int n = grid[i].length;
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < m; i++){
            int n = grid[i].length;
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    steps = rotting(grid,m,i,j,0);
                    found = true;
                    break;
                }
                if(found) break;
            }
        }

        System.out.println("Final Grid : ");
        for(int i = 0; i < m; i++){
            int n = grid[i].length;
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }    
        
        //Check if all rotten or not
        for(int i = 0; i < m; i++){
            int n = grid[i].length;
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return steps;
    }

    private int rotting(int[][] grid,int m,int i,int j,int steps){
        int dx[] = {-1,0,1,0};
        int dy[] = {0,-1,0,1};
        boolean success = false;
        for(int k = 0; k < 4; k++){
            int di = i+dx[k];
            int dj = j+dy[k];
    
            //boundary-check
            if(di >= m || di < 0 || dj < 0)
                continue;

            int n = grid[di].length;

            if(dj >= n)
                continue;
            
            if(grid[di][dj] == 1){
                grid[di][dj] = 2;
                success = true;
                steps = rotting(grid,m,di,dj,steps);
            }
        }
        if(success)
            steps++;

        return steps;
        */

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int minutes = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2)
                    q.offer(new int[]{i,j});
                else if(grid[i][j] == 1)
                    fresh++;
            }
        }

        int dx[] = {-1,0,1,0};
        int dy[] = {0,-1,0,1};

        while(!q.isEmpty() && fresh > 0){
            int size = q.size();

            for(int s = 0; s < size; s++){
                int[] curr = q.poll();
                int i = curr[0] , j = curr[1];
                
                for(int k = 0; k < 4; k++){
                    int ni = dx[k] + i;
                    int nj = dy[k] + j;

                    if(ni < 0 || nj < 0 || ni >= m || nj >= n)
                        continue;
                    
                    if(grid[ni][nj] == 1){
                        grid[ni][nj] = 2;
                        fresh--;
                        q.offer(new int[]{ni,nj});
                    }
                }
            }

            minutes++;
        }

        return (fresh<=0) ? minutes : -1;
    }
}