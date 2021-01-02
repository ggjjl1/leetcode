#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def lastStoneWeight(self, stones):
        """
        :type stones: List[int]
        :rtype: int
        """
        stones.sort()
        while len(stones) > 1:
            s = stones.pop()
            m = stones.pop()
            if s <> m : 
                stones.append(s-m)
                stones.sort()
        if len(stones) == 0: return 0
        if len(stones) == 1: return stones[0]

def main():
    s = Solution()
    w = s.lastStoneWeight([2,7,4,1,8,1])
    print(w)

if __name__ == '__main__':
    main()