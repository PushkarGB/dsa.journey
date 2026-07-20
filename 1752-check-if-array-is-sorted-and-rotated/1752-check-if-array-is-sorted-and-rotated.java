class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        for(int i = 1; i < n; i++){
            if(arr[i-1]>arr[i]) //breaks the sorting order 
                cnt++;
        }

        if(cnt>0){ // if there are breaks which means possibility of rotation
             if(arr[n-1] > arr[0]){ //breaks the sorting order , even if it is rotated
                 cnt++;
             }
        }
       
        
        /* There can only be one break , which will between last and 1st even in rotated array , but if more than one is found its not sorted  */
        return cnt<=1;
    }
}