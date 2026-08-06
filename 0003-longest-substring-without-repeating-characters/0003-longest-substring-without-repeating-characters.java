class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
       // HashMap<Character,Integer> map = new HashMap<>(); //or use a arr = new int[no. of possible characters in string] since here it is ASCII characters so 128
       int[] lastSeen = new int[128];
        int maxLen = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // if(map.containsKey(ch)){
            //     left = Math.max(map.get(ch)+1,left); //ensure left only jumps forward not backward 
            // } 
            //map.put(ch,i);
            if(lastSeen[ch]>0){
                left = Math.max(lastSeen[ch],left);
            }
            lastSeen[ch] = i+1; //if i = 0 , last seen 1 , becz then 0 will mean not seen before.
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}