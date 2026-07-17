class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();
        for(int i = 0; i < arr.length/2; i++){
            if(arr[i] != arr[arr.length-1-i]) return false;
        }
        return true;
    }
}