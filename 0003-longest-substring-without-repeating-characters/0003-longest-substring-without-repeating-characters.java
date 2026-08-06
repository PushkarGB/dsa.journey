class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
        HashMap<Character,Integer> map = new HashMap<>(); //or use a arr = new int[no. of possible characters in string]
        int maxLen = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                left = Math.max(map.get(ch)+1,left); //ensure left only jumps forward not backward 
            }
            map.put(ch,i);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}