# 49. Group Anagrams

**Link:** https://leetcode.com/problems/group-anagrams/
**Difficulty:** 🟡 Medium
**Date Solved:** 2026-03-13
**Topic:** Array, String, Hash Map

---

## 🧩 Problem Summary

Given an array of strings `strs`, group all anagrams together.
Anagrams are words that have the same characters in different order.
Example: "eat", "tea", "ate" are all anagrams.

---

## 💡 Approach

1. Create a HashMap (sorted word → list of anagrams)
2. Loop through each word in strs
3. Sort the word alphabetically → this becomes the KEY
   - "eat" → "aet"
   - "tea" → "aet"
   - "tan" → "ant"
4. Add original word to its group in the map
5. Return all groups (map.values())

---

## 🧪 Example

Input: ["eat","tea","tan","ate","nat","bat"]

| Word | Sorted Key | Group         |
|------|-----------|---------------|
| eat  | aet       | [eat]         |
| tea  | aet       | [eat, tea]    |
| tan  | ant       | [tan]         |
| ate  | aet       | [eat, tea, ate]|
| nat  | ant       | [tan, nat]    |
| bat  | abt       | [bat]         |

Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]] ✅

---

## ⏱️ Complexity

| | Complexity |
|-|------------|
| **Time** | O(n * k log k) — n words, k = max word length (sorting) |
| **Space** | O(n * k) — storing all words in HashMap |

---

## 🏷️ Tags

`array` `string` `hash-map` `sorting`

---

## 📌 Key Insight

> Anagrams always produce the SAME string when sorted!
> Use the sorted version as a HashMap key to
> automatically group all anagrams together.

---

