# 141. Linked List Cycle

**Link:** https://leetcode.com/problems/linked-list-cycle/
**Difficulty:** 🟢 Easy
**Date Solved:** 2026-03-19
**Topic:** Linked List, Two Pointers, Floyd's Algorithm

---

## 🧩 Problem Summary

Given the head of a linked list, determine if the linked list
has a cycle in it.
A cycle means some node's `next` pointer points back to a
previous node — causing an infinite loop.

---

## 💡 Approach (Floyd's Cycle Detection — Two Pointers)

1. Initialize `slow` at head, `fast` at head.next
2. Move `slow` by 1 step, `fast` by 2 steps each iteration
3. If they ever meet → cycle exists → return true
4. If `fast` reaches null → no cycle → return false

---

## 🧪 Example

No Cycle:
1 → 2 → 3 → 4 → null
fast reaches null → return false ✅

With Cycle:
1 → 2 → 3 → 4
         ↑       ↓
         6  ←  5

slow and fast will eventually meet → return true ✅

---

## 👣 Step-by-step Trace (Cycle Example)

head = [3, 2, 0, -4],  cycle at index 1

| Step | slow | fast |
|------|------|------|
| Start| 3    | 2    |
| 1    | 2    | 0    |
| 2    | 0    | 2    |
| 3    | -4   | -4   | ← MEET! return true ✅

---

## ⏱️ Complexity

| | Complexity |
|-|------------|
| **Time** | O(n) — fast pointer covers list at most twice |
| **Space** | O(1) — only two pointers used, no extra space |

---

## ⚠️ Edge Cases

- Empty list (head == null) → return false
- Single node with no cycle → return false
- Single node pointing to itself → return true

---

## 🏷️ Tags

`linked-list` `two-pointers` `floyd-cycle-detection` `fast-slow-pointer`

---

## 📌 Key Insight

> Imagine two runners on a circular track.
> The faster one will ALWAYS lap and catch the slower one
> if a cycle exists.
> If no cycle, the fast runner simply falls off the end (null).
> This is Floyd's Tortoise and Hare Algorithm!

---