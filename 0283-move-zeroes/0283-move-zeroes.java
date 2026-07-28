class Solution {
    public void moveZeroes(int[] arr) {
            int n = arr.length;
            
            if(n==0) return;
            
            int lastNZ = -1;
            for(int i = 0; i<n; i++){
                if(arr[i]!=0){
                    lastNZ++;
                    int tmp = arr[lastNZ];
                    arr[lastNZ] = arr[i];
                    arr[i] = tmp;
                }                    
            }

            
    }
}
