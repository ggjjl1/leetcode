#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def removeStones(self, stones):
        """
        :type stones: List[List[int]]
        :rtype: int
        """
        print(stones)


if __name__ == '__main__':
    stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
    s = Solution()
    s.removeStones(stones)