
    // Problem: Ransom Note
// Link: https://leetcode.com/problems/ransom-note/
// Difficulty: Easy
// Date: 2026-03-09

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> count = new HashMap<>();

        // Store frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be built from magazine
        for (char c : ransomNote.toCharArray()) {
            if (!count.containsKey(c) || count.get(c) == 0) {
                return false;  // letter not available
            }
            count.put(c, count.get(c) - 1);  // use the letter
        }

        return true;
    }
}

