class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[k];

        if(k == 0 || k == n ) return;
        k = k % n;
        int j = 0;
        for(int i = n-k; i < n; i++){
            temp[j++] = nums[i];
        }
        for(int i = n-k-1; i >= 0; i--){
            nums[i+k] = nums[i];
        }

        for(int i = 0; i < k; i++){
            nums[i] = temp[i];
        }


    }
}