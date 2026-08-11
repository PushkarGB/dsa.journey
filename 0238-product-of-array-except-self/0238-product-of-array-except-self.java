class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int n = nums.length;
        // int product = 1;
        // for(int i = 0; i < n; i++){
        //     product = 1;
        //     for(int j = 0; j < n; j++){
        //         if(i==j) continue;
        //         product*=nums[j];
        //     }
        //     answer[i] = product;
        // }
        // return answer;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        Arrays.fill(prefix,1);
        Arrays.fill(suffix,1);

        int[] amswer = new int[n];

        prefix[0] = 1;
        suffix[n-1] = 1;

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
            suffix[n-i-1] = suffix[n-i] * nums[n-i]; 
        }
        for(int i = 0; i < n; i++){
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }
}