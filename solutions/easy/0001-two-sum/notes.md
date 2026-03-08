# 1. Two Sum

**Link:** https://leetcode.com/problems/two-sum/
**Difficulty:** 🟢 Easy
**Date Solved:** 2026-03-08
**Topic:** Array, Hash Map

---

## 🧩 Problem Summary

Given an array of integers `nums` and an integer `target`,
return indices of the two numbers that add up to `target`.

---

## 💡 Approach

1. Create an empty HashMap `seen` (stores number → index)
2. Loop through the array
3. Calculate `complement = target - nums[i]`
4. If `complement` exists in map → return both indices
5. Otherwise, put `nums[i]` with index `i` into the map

---

## ⏱️ Complexity

| | Complexity |
|-|------------|
| **Time** | O(n) — one pass through array |
| **Space** | O(n) — HashMap stores upto n elements |

---

## 🏷️ Tags

`array` `hash-map`

---

## 📌 Key Insight

> Instead of checking every pair (brute force O(n²)),
> store each number's index in a HashMap so we can
> look up the complement in O(1) time.
