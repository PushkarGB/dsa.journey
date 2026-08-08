class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        Map<Character,Integer> map = new HashMap<>();
        int l = 0; 
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                l = Math.max(l,map.get(ch)+1);
            }
            map.put(ch,i);
            maxLen = Math.max(maxLen,i-l+1);
        }
        return maxLen;
    }
    //"jbpnbwwd" "anviaj"
}