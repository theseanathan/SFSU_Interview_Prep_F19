/*
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (i.e., buy one and sell
 one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Input: [7,1,5,3,6,4]
Output: 5

Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
             Input: [7,6,4,3,1]
             Output: 0
             Explanation: In this case, no transaction is done, i.e. max profit = 0

*/

public int profit(int[] stockPrices) {
/*
    // first approach... brute force? time: O(n^2),  space:O(1)?

    int max_profit = 0;

    for (int i = 0; i < stockPrices.length; i++) {
	for (int j = i + 1; j < stockPrices.length; j++) {
	    //get the current profit 
	    int profit = stockPrices[j] - stockPrices[i];
	    
	    //update the max_profit to always have the biggest value 
	    // so... we can use if(profit > max_profit) --> make max_profit = profit
	    // or... we can use max_profit = Math.max(profit, max_profit); this is shorter..
	    max_profit = Math.max(profit, max_profit);	
	}
    }
    return max_profit;
*/
   
    //can we do better?
    // time: O(n), space: O(1)
   
    //logic: max profit... what does it mean? -> bigger # subtract smaller #
    //     : soo we need 2 variables to store the bigger & smaller number
    //     : so to get max profit, we want to keep the smaller number to get smaller asap
    //     : and to keep the bigger number to keep getting bigger...

    // store first number so we can start at day 2 after
    int prices_initial = stockPrices[0];

    //variable to store max profit
    int max_profit = 0;

    // check all the stock prices starting day 2 (since we checked day 1)
    for (int i = 1; i < stockPrices.length; i++) {
	// we either keep the previous profit, unless the current stock price subtract 
	// the smallest price we currently have gives us the bigger profit
	max_profit = Math.max(max_profit, stockPrices[i] - prices_intial);

	//now keep the smallest number to be smaller or keep it as it is, unless
	//we find the current stock price has the lowest value
	prices_inital = Math.min(prices_inital, stockPrices[i]);        
    }
    return max_profit;
}

