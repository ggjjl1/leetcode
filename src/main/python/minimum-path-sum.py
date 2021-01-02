#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        gridSum = []
        m, n = len(grid), len(grid[0])
        for i in range(0, m):
            gridSum.append([])
            for j in range(0, n):
                if i == 0 and j == 0:
                    gridSum[i].append(grid[i][j])
                elif i == 0:
                    gridSum[i].append(gridSum[i][j-1] + grid[i][j])
                elif j == 0:
                    gridSum[i].append(gridSum[i-1][j] + grid[i][j])
                else:
                    if gridSum[i-1][j] < gridSum[i][j-1]:
                        gridSum[i].append(gridSum[i-1][j] + grid[i][j])
                    else:
                        gridSum[i].append(gridSum[i][j-1] + grid[i][j])
        
        return gridSum[m-1][n-1]

def main():
    matrix = [
        [1,3,1],
        [1,5,1],
        [4,2,1]
    ]
    s = Solution()
    print(s.minPathSum(matrix))

if __name__ == '__main__':
    main()