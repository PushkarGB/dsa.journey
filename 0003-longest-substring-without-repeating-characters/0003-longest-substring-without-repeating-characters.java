class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
        HashSet<Character> window = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
             if (window.contains(s.charAt(i))) {
                maxLen = Math.max(maxLen, window.size());
               while(window.contains(s.charAt(i))){
                    window.remove(s.charAt(left));
                    left++;
               } 
            }
            window.add(s.charAt(i));   
        }
        maxLen = Math.max(maxLen, window.size());
        return maxLen;
    }
}