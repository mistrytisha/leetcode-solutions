# 383. Ransom Note

**Link:** https://leetcode.com/problems/ransom-note/
**Difficulty:** 🟢 Easy
**Date Solved:** 2026-03-09
**Topic:** String, Hash Map

---

## 🧩 Problem Summary

Given two strings `ransomNote` and `magazine`, return `true`
if `ransomNote` can be constructed using letters from `magazine`.
Each letter in magazine can only be used once.

---

## 💡 Approach

1. Create a HashMap to store frequency of each letter in `magazine`
2. Loop through `ransomNote`
3. If letter is missing OR count is 0 → return false
4. Otherwise decrease that letter's count by 1
5. If loop completes → return true

---

## ⏱️ Complexity

| | Complexity |
|-|------------|
| **Time** | O(m + n) — loop through both strings once |
| **Space** | O(1) — at most 26 letters in HashMap |

---

## 🏷️ Tags

`string` `hash-map` `frequency-count`

---

## 📌 Key Insight

> Magazine is like a "letter bank". For each letter in
> ransomNote, withdraw one from the bank.
> If bank is empty for that letter → return false.

---
