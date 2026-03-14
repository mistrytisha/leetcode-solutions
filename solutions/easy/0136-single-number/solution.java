// Problem: Single Number
// Link: https://leetcode.com/problems/single-number/
// Difficulty: Easy
// Date: 2026-03-14

import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Find the number with frequency 1
        for (int num : count.keySet()) {
            if (count.get(num) == 1) {
                return num;
            }
        }

        return -1; // never reached
    }
}