class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;    
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target) return mid;

            //now find the sorted half
            if(nums[left]<=nums[mid]){  // if left side is sorted 
                if(nums[left]<=target && target < nums[mid]) // if target in left side 
                    right = mid-1; //bring r to left side
                else //target not in left side
                    left = mid+1; //go to right side 
            }else{
                if(nums[mid] < target && target <= nums[right]) //if target in right side
                    left = mid+1; //bring l to right side
                else
                    right = mid-1; //go to left side
            }
        }
        return -1;
    }
}