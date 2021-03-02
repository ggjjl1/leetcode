#!/usr/bin/env python
# -*- coding: utf-8 -*-


class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        m, n = abs(dividend), abs(divisor)
        r = 0
        while m > n:
            m = m - n
            r = r + 1

        return r if dividend * divisor >= 0 else -r


if __name__ == '__main__':
    s = Solution()
    print(s.divide(-2147483648, -1))