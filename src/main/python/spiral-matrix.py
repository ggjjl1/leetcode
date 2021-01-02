#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix) < 1: return matrix
        height, width = len(matrix), len(matrix[0])
        startx, starty = -1, -1
        result = []
        # 总共x层，x = m / 2 + m % 2 或者 x = n / 2 + n % 2
        for x in range(0, min(height, width) / 2 + min(height, width) % 2):
            m, n = height - 2 * x, width - 2 * x
            startx, starty = startx + 1, starty + 1
            endx, endy = startx + m, starty + n
            i, j = startx, starty
            for j in range(starty, endy):
                result.append(matrix[i][j])
            for i in range(startx + 1, endx):
                result.append(matrix[i][j])
            if m == 1 or n == 1: break
            for j in range(endy - 2, starty - 1, -1):
                result.append(matrix[i][j])
            for i in range(endx - 2, startx, -1):
                result.append(matrix[i][j])
        
        return result

def main():
    matrix = [[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]
    s = Solution()
    print(s.spiralOrder(matrix))

if __name__ == '__main__':
    main()