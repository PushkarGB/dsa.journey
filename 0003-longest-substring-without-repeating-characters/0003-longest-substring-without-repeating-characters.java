class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        HashSet<Character> set = new HashSet<>();
        int l = 0; 
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen,i-l+1);
        }
        return maxLen;
    }
    //"jbpnbwwd" "anviaj"
}