class Solution {
    public int mySqrt(int x) {

        if(x < 2) return x; 
        // we need largest integer y such that y^2 <=x
        // lets say we start from 2 , we need to find a number between 2 to X or we can only see till X/2
        int l = 0;
        int r = x/2;
        int ans = 0;
        while(l<=r){
            int mid =  l+(r-l)/2;
            if((long) mid*mid <= x){
                ans = mid;
                l = mid+1; 
            }
            else{
                r = mid-1; // if mid*mid > x , then we need to use lower mid value
            }
        }

        return ans;
    
    }
}