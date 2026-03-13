// Problem: Group Anagrams
// Link: https://leetcode.com/problems/group-anagrams/
// Difficulty: Medium
// Date: 2026-03-13

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Sort the word to get the key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // If key doesn't exist, create new list
            map.putIfAbsent(key, new ArrayList<>());

            // Add original word to its group
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}