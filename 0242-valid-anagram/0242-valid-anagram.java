class Solution {
    public boolean isAnagram(String s, String t) {
       
        if(s.length() != t.length()) return false;

        /*
        String sorted1 , sorted2;
        char ch[] = s.toCharArray(); //O(n)
        Arrays.sort(ch); //O(n log n)
        sorted1 = new String(ch);

        ch = t.toCharArray(); //O(n)
        Arrays.sort(ch); //O(n log n)
        sorted2 = new String(ch);

        return sorted1.equals(sorted2); //O(k)

        //TC = O(N) + O(N Log N) + O(N) + O(N Log N) + O(N) = O(N Log N)
        */

        int[] freq1 = new int[28];
        int[] freq2 = new int[28];
        for(char ch : s.toCharArray()){
            freq1[ch-'a']+=1;
        }
        for(char ch : t.toCharArray()){
            freq2[ch-'a']+=1;
        }
        
        for(int i = 0; i < 28; i++){
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
}