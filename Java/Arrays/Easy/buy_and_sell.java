/*
    You are given an array prices for which the ith element is the price of a given stock on day i.

    Find the maximum profit you can achieve. You may complete as many transactions as you like 
    (i.e., buy one and sell one share of the stock multiple times).

    Note: You may not engage in multiple transactions simultaneously 
    (i.e., you must sell the stock before you buy again).
*/

class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int[] margins = new int[size-1];
        int profit = 0;
        
        for(int i=0; i<size-1; i++){
            margins[i] = prices[i+1] - prices[i];
        }
        for(int j=0; j<size-1; j++){
            if(margins[j] > 0){
                profit += margins[j];
            }
        }
        return profit;
    }
}