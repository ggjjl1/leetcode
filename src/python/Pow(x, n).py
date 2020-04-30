#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        result = 0
        if n > 0:
            result = self.purePow(x, n)
        elif n == 0:
            result = 1
        else:
            result = 1.0 / self.purePow(x, -n)
        return result

    def purePow(self, x, n):
        result = 1
        while n > 0:
            result = result * x
            n = n - 1
            print(result)
        return result
        
def main():
    s = Solution()
    # print(s.myPow(2.1, 3))
    print(s.myPow(0.00001,2147483647))

if __name__ == '__main__':
    main()