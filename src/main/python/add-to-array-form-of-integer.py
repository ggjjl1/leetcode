#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def addToArrayForm(self, A, K):
        """
        :type A: List[int]
        :type K: int
        :rtype: List[int]
        """
        sum = 0
        for i in A:
            sum = sum * 10 + i
        sum = sum + K
        return list(str(sum))


if __name__ == '__main__':
    s = Solution()
    res = s.addToArrayForm([1,2,0,0], 34)
    print(res)