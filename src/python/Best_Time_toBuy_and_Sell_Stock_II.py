#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        buy_price = -1
        profit = 0
        for i in range(0, len(prices)):
            if i + 1 < len(prices):
                if prices[i] < prices[i+1]:
                    if buy_price == -1: 
                        buy_price = prices[i]
                else:
                    if buy_price <> -1: 
                        profit = profit + prices[i] - buy_price
                        buy_price = -1
            else: 
                if buy_price <> -1: 
                    profit = profit + prices[i] - buy_price
                    buy_price = -1
        return profit

def main():
    s = Solution()
    l = s.maxProfit([2,1,2,0,1])
    print(l)

if __name__ == '__main__':
    main()