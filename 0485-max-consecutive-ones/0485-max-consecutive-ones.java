class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int curCnt = 0 , maxCnt = 0;
        for(int i : nums){
            if(i == 1) curCnt+=1;
            else {
                maxCnt = Math.max(curCnt,maxCnt);
                curCnt = 0;
            }
        }
        maxCnt = Math.max(curCnt,maxCnt);
        return maxCnt;
    }
}