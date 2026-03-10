# 217. Contains Duplicate

**Link:** https://leetcode.com/problems/contains-duplicate/
**Difficulty:** 🟢 Easy
**Date Solved:** 2026-03-10
**Topic:** Array, Hash Map

---

## 🧩 Problem Summary

Given an integer array `nums`, return `true` if any value
appears at least twice, and `false` if every element is distinct.

---

## 💡 Approach

1. Create an empty HashMap
2. Loop through the array
3. If current number already exists in map → return true (duplicate!)
4. Otherwise store the number in map
5. If loop completes → return false (all distinct)

---

## ⏱️ Complexity

| | Complexity |
|-|------------|
| **Time** | O(n) — one pass through array |
| **Space** | O(n) — HashMap stores up to n elements |

---

## 🏷️ Tags

`array` `hash-map`

---

## 📌 Key Insight

> HashMap works as a "visited" tracker.
> If we see a number we've already visited → duplicate found!
> Beats brute force O(n²) of checking every pair.

---
