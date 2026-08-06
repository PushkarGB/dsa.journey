class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
        HashSet<Character> window = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while(window.contains(ch)){
                    window.remove(s.charAt(left));
                    left++;
            }
            window.add(ch);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}