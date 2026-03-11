// Problem: Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Date: 2026-03-12


class solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price:prices){
            if(price<min_price){
                min_price=price;
            }
            else if(price - min_price > maxProfit){
                maxProfit = price - min_price;
            }
        }
        return maxProfit;
    }
}