#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
两个数相除
"""

class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        return dividend / divisor


if __name__ == '__main__':
    s = Solution()
    print(s.divide(100, 3))