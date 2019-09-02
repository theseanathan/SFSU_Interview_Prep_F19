class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        curProfit = 0
        maxProfit = 0
        start = 0
        if not prices: # if empty list, return 0 as profit
            return 0
        minPrice = prices[0] #set cur min price to first price in list
        end = len(prices) - 1
        for i in range(len(prices)):
            if prices[i] < minPrice:
                minPrice = prices[i]
            curProfit = prices[i] - minPrice #curprofit = sell price - current min price
            maxProfit = max(maxProfit, curProfit) # max profit = max value between maxprofit and cur profit
        return maxProfit
