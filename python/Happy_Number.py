#!/usr/bin/env python
# -*- coding: utf-8 -*-
import sys

class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        s = set()
        while self.happyNumber(n) not in s:
            s.add(self.happyNumber(n))
            n = self.happyNumber(n)
        return n == 1

    def happyNumber(self, a):
        result = 0
        while a >= 10:
            a, b = a / 10, a % 10
            result = result + b * b
        return result + a * a

def main():
    s = Solution()
    print s.isHappy(2)

if __name__ == '__main__':
    main()