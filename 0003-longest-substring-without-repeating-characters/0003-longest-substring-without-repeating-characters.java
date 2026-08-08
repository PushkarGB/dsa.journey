class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        int l = 0; 
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(lastSeen[ch]>0){
                l = Math.max(l,lastSeen[ch]);
            }
            lastSeen[ch] = i+1;
            maxLen = Math.max(maxLen,i-l+1);
        }
        return maxLen;
    }
    //"jbpnbwwd" "anviaj"
}