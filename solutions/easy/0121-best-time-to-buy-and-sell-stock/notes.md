# 121. Best Time to Buy and Sell Stock

**Link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
**Difficulty:** 🟢 Easy
**Date Solved:** 2026-03-12
**Topic:** Array, Sliding Window, Greedy

---

## 🧩 Problem Summary

Given an array `prices[]` where prices[i] is the stock price on day i.
Pick one day to buy and a future day to sell.
Return the maximum profit. If no profit possible, return 0.

---

## 💡 Approach

1. Track `minPrice` (cheapest buy so far) = MAX_VALUE initially
2. Track `maxProfit` = 0
3. Loop through prices:
   - If current price < minPrice → update minPrice (better buy day)
   - Else calculate profit = current price - minPrice
   - If profit > maxProfit → update maxProfit
4. Return maxProfit

---

## 🧪 Example

prices = [7, 1, 5, 3, 6, 4]

| Day | Price | minPrice | maxProfit |
|-----|-------|----------|-----------|
| 0   | 7     | 7        | 0         |
| 1   | 1     | 1        | 0         |
| 2   | 5     | 1        | 4         |
| 3   | 3     | 1        | 4         |
| 4   | 6     | 1        | 5         |
| 5   | 4     | 1        | 5         |

Answer: 5 ✅

---

## ⏱️ Complexity

| | Complexity |
|-|------------|
| **Time** | O(n) — one pass through array |
| **Space** | O(1) — only two variables used |

---

## 🏷️ Tags

`array` `greedy` `sliding-window`

---

## 📌 Key Insight

> Always track the MINIMUM price seen so far.
> At each day, ask "if I sell TODAY, what's my profit?"
> Keep updating the best profit found.
> No need for nested loops — O(n) beats brute force O(n²).

---
