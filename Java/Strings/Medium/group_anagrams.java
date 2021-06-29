/*
    Given an array of strings strs, group the anagrams together. 
    You can return the answer in any order.

    An Anagram is a word or phrase formed by rearranging the letters 
    of a different word or phrase, typically using all the original letters exactly once.

    Example 1:

    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    Example 2:

    Input: strs = [""]
    Output: [[""]]

    Example 3:

    Input: strs = ["a"]
    Output: [["a"]]
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<String, List>();
        for(int i=0; i<strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}