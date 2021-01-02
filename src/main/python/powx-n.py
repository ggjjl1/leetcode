#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        r, i = 1.0, abs(n)
        while(i <> 0):
            if i % 2 <> 0: r = r * x
            i = i / 2
            x = x * x
        return r if n > 0 else 1.0 / r

def main():
    s = Solution()
    print(s.myPow(2.00000, -2))

if __name__ == '__main__':
    main()