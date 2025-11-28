package dsa.arrays;

/*
 * 121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class Program121 {

	public static void main(String[] args) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };
		int res = maxProfit(prices);

		System.out.println(res);

	}

	public static int maxProfit(int[] prices) {

		int result = 0;
		for (int i = 0; i < prices.length; i++) {

			for (int j = i; j < prices.length; j++) {

				if (prices[i] < prices[j]) {
					result = j;
				}

			}

		}

		return result;

	}
	
	
	public int maxProfit1(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int j = 1; j < prices.length; j++) {

            if (prices[j] < minPrice) {
                minPrice = prices[j];
            } else {
                // If selling today, what profit we get?
                int profit = prices[j] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }

            }
        }
        return maxProfit;
    }

}
