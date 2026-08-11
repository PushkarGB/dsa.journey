class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); 
        
        /*
        //1st attempt
        for (String s : strs) { //O(n)

            char[] chars = s.toCharArray(); // O(k) k - length of s . space - O(k)
            Arrays.sort(chars); // O(k*log k) 
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s); //o(1) //Space - O(n) -> n key-map pairs in worst case but even if not we are storing distinct keys and list
        }
        //now iterate over the anagram and create Lists for each key adding str at index given in val and add that list in the final answer -> can be done with costructor
        
        //Overall TC = O(n) O(1+ k + k log k) = O(n*klogk) //Overall SC - O(n*k)
        
        */

        //2nd attempt
        //Idea is I don't think we can replace HashMap , but we can reduce O(k*log k) as we did in valid Anagrams problem -> by using freq array instead of sorting but we cannot add freq array as key

        for(String s : strs){ //O(n) 
            int freq[] = new int[28];
            for(char ch : s.toCharArray()){ //O(k) + O(k) = O(k) //k - length of s
                freq[ch-'a']+=1;
            }
            StringBuilder key = new StringBuilder();
            for(int count : freq){ //O(28) -> O(1)
                key.append(count).append('#'); //O(1)
            }
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s); //o(1) //Space - O(n)

        }
        //Final TC - O(n*k)
        return new ArrayList<List<String>>(map.values());

    }
}