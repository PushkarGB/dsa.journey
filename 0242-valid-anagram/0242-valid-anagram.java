class Solution {
    public boolean isAnagram(String s, String t) {
       
        if(s.length() != t.length()) return false;

        String sorted1 , sorted2;
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        sorted1 = new String(ch);

        ch = t.toCharArray();
        Arrays.sort(ch);
        sorted2 = new String(ch);

        return sorted1.equals(sorted2);
    }
}