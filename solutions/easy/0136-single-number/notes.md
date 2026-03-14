# 136. Single Number

**Link:** https://leetcode.com/problems/single-number/
**Difficulty:** 🟢 Easy
**Date Solved:** 2026-03-14
**Topic:** Array, Hash Map, Bit Manipulation

---

## 🧩 Problem Summary

Given a non-empty array of integers `nums`, every element
appears TWICE except for one. Find and return that single one.

Example:
- Input:  [4, 1, 2, 1, 2]
- Output: 4 ✅

---

## 💡 Approach (HashMap)

1. Create a HashMap to store frequency of each number
2. Loop through array → count occurrences of each number
3. Loop through map → find the number with count == 1
4. Return that number

---

## 🧪 Example

nums = [4, 1, 2, 1, 2]

| Number | Count |
|--------|-------|
| 4      | 1     | ← answer!
| 1      | 2     |
| 2      | 2     |

Output: 4 ✅

---

## ⏱️ Complexity

| | Complexity |
|-|------------|
| **Time** | O(n) — two passes through array |
| **Space** | O(n) — HashMap stores up to n elements |

---

## 💡 Bonus Approach (XOR — O(1) Space)

> XOR of a number with itself = 0
> XOR of a number with 0 = number itself
> So XOR-ing all numbers cancels out duplicates!

int result = 0;
for (int num : nums) {
    result ^= num;
}
return result;

Time: O(n) | Space: O(1) ← more optimal!

---

## 🏷️ Tags

`array` `hash-map` `bit-manipulation` `xor`

---

## 📌 Key Insight

> HashMap approach is intuitive and easy to remember.
> But XOR trick is the optimal solution —
> duplicates cancel each other out, leaving only the single number!

---