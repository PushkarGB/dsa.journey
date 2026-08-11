class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        /*
        //first attempt : brute force
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int l = j - i;
                int h = Math.min(height[i],height[j]);
                max = Math.max(l*h,max);
            }
        }
        //TC O(n*(n-i)) = O(n*n)
        */

        //2nd attempt : if I start with l=0 and r=n-1 , area will be (r-l) * min(height[l],height[r])
        //what is limiting the area ? height[l] if l++ , fixed width decrease by 1 but height increase
        //but if r-- -> fixed width decrease by 1 but fix hieght decrase also 

        int l = 0; 
        int r = n-1;
        while(l<r){
            int area = (r-l)*Math.min(height[l],height[r]);
            max = Math.max(area,max);

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }

        return max;
    }
}