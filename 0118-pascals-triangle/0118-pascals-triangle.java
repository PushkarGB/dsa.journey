class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix = new ArrayList<>();

        for(int r = 0; r < numRows; r++){
            List<Integer> temp = new ArrayList<>();
            for(int c = 0; c <= r; c++){
                if(c == 0 || c == r) temp.add(1);
                else 
                    temp.add(matrix.get(r-1).get(c-1) + matrix.get(r-1).get(c));
            }
            matrix.add(temp);
        }

        return matrix;
    }
}