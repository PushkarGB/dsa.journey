class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 , j = 0;
        List<Integer> merged = new ArrayList<Integer>();
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                merged.add(nums1[i++]);
            }
            else{
                merged.add(nums2[j++]);;
            }
        }
        while(i<m){
            merged.add(nums1[i++]);
        }
        while(j<n){
            merged.add(nums2[j++]);
        }
        System.out.println(merged);
        for(int k = 0; k < m+n; k++){
            nums1[k] = merged.get(k);
        }
    }
}