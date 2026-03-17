# 111. Minimum Depth of Binary Tree

**Link:** https://leetcode.com/problems/minimum-depth-of-binary-tree/
**Difficulty:** 🟢 Easy
**Date Solved:** 2026-03-17
**Topic:** Tree, Recursion, DFS, BFS

---

## 🧩 Problem Summary

Given the root of a binary tree, return its minimum depth.
Minimum depth = number of nodes along the SHORTEST path
from root down to the nearest leaf node.
A leaf node is a node with NO children.

---

## 💡 Approach (Recursive DFS)

1. If root is null → return 0 (base case)
2. If only RIGHT child exists → recurse right + 1
3. If only LEFT child exists → recurse left + 1
4. If BOTH children exist → return min(left, right) + 1

---

## ⚠️ Common Mistake

> Do NOT simply return min(left, right) + 1 for all cases!
> If a node has only ONE child, the other side returns 0
> which would incorrectly be picked as the minimum.

Example of wrong thinking:

        1
         \
          2

- Wrong answer: min(0, 2) + 1 = 1  ❌
- Right answer: 2  ✅ (leaf is node 2, not node 1)

---

## 🧪 Example

        3
       / \
      9  20
         / \
        15   7

- Left subtree min depth  = 1 (node 9 is a leaf)
- Right subtree min depth = 2
- Answer = min(1, 2) + 1 = 2 ✅

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

> Unlike Maximum Depth, you CANNOT ignore a missing child.
> If one child is missing, the node is NOT a leaf —
> so you must go down the existing child's path.
> Always handle one-child cases separately!

---
