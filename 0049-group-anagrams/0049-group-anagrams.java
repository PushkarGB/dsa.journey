class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        //now iterate over the anagram and create Lists for each key adding str at index given in val and add that list in the final answer -> can be done with costructor
        return new ArrayList<List<String>>(map.values());
    }
}