#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def maxScoreSightseeingPair(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        maxValue  = A[0] + 0
        score = 0
        for j in range(1, len(A)):
            score = max(score, maxValue+A[j]-j)
            maxValue = max(maxValue, A[j]+j)
        
        return score

def main():
    s = Solution()
    print(s.maxScoreSightseeingPair([8,1,5,2,6]))

if __name__ == '__main__':
    main()