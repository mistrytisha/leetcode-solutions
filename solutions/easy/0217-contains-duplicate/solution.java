// Problem: Contains Duplicate
// Link: https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Date: 2026-03-10

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                return true;  // duplicate found
            }
            count.put(nums[i], i);
        }

        return false;  // no duplicates
    }
}