# 104. Maximum Depth of Binary Tree

**Link:** https://leetcode.com/problems/maximum-depth-of-binary-tree/
**Difficulty:** 🟢 Easy
**Date Solved:** 2026-03-12
**Topic:** Tree, Recursion, DFS

---

## 🧩 Problem Summary

Given the root of a binary tree, return its maximum depth.
Maximum depth = number of nodes along the longest path
from root down to the farthest leaf node.

---

## 💡 Approach (Recursive DFS)

1. If root is null → return 0 (base case)
2. Recursively find depth of LEFT subtree
3. Recursively find depth of RIGHT subtree
4. Return max(left, right) + 1  ← +1 counts current node

---

## 🧪 Example

        3
       / \
      9  20
         / \
        15   7

- Left subtree depth  = 1
- Right subtree depth = 2
- Answer = max(1, 2) + 1 = 3 ✅

---

## ⏱️ Complexity

| | Complexity |
|-|------------|
| **Time** | O(n) — visit every node once |
| **Space** | O(h) — h = height of tree (recursion stack) |

---

## 🏷️ Tags

`tree` `recursion` `dfs` `binary-tree`

---

## 📌 Key Insight

> Think of it as: "What's the tallest path I can take
> going left vs going right?"
> At every node, pick the taller side and add 1 for yourself.
> Recursion handles the rest automatically!

---

