class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0 , left = 0 , bottom = matrix.length-1 , right = matrix[0].length-1;

        List<Integer> ans = new ArrayList<>();

        while(top <= bottom && left <= right){
            
            //left to right (starts from top left corner) 
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //top to bottom (starts from top RIGHT corner)
            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(bottom>=top){
                //right to left (starts at bottom right corner)
                for(int i = right; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                //bottom to top (starts from bottom left corener)
                for(int i = bottom; i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }

        return ans;
    }
}