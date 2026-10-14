class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i = 0; i < matrix.length; i++){
            reverse(matrix[i]);
        }
    }

    private void transpose(int[][] matrix){
        int n = matrix[0].length;
        int k = 1;
        int r = 0;
        while(k < n){
            for(int c = k; c < n; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
            r++;
            k++;
        }
    }

    private void reverse(int[] row){
        int n = row.length;
        for(int i = 0; i < n/2; i++){
            int temp = row[i];
            row[i] = row[n-i-1];
            row[n-i-1] = temp;
        }
    }
}