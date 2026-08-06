class Solution {
    public int maxSubArray(int[] nums) {
    
    int currSum = nums[0];
    int bestSum = nums[0];
    
    for(int i=1; i<nums.length; i++){
        currSum = Math.max(currSum+nums[i],nums[i]);
        bestSum = Math.max(bestSum,currSum);
    }

    return bestSum;
    
    /*
        //First Attempt
        //TLE
        int n= nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
           int  sum = 0;
            for(int j = i; j < n; j++){
                sum+=nums[j];
                if(sum > max)
                    max = sum;
            }
        }
        return max;
    */
    }
}