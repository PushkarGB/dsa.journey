class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
        HashSet<Character> ht = new HashSet<>();
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            ht.clear();
            for (int j = i; j < s.length(); j++) {
                if (ht.contains(s.charAt(j))) {
                    maxLen = Math.max(maxLen, ht.size());
                    break;
                }
                ht.add(s.charAt(j));
            }
            maxLen = Math.max(maxLen,ht.size());
        }
        return maxLen;
    }
}