class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         int m = nums1.length, n = nums2.length;
        int i = 0 , j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> merged = new HashSet<Integer>();
        while(i<m && j<n){
            if(nums1[i] == nums2[j]){
                merged.add(nums1[i++]);
                j++;
            }
            else if (nums1[i] < nums2[j]){
               i++;
            }else{
                j++;
            }
        }
        int ans[] = new int[merged.size()];
        i = 0;
        for(Integer num : merged){
            ans[i++] = num;
        }
        return ans;
    }
}