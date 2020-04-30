#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
leetcode 48. Rotate Image
"""

class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        pixel = 0
        for i in range(0, n / 2 + n % 2):
            for j in range(i, n - 1 - i):
                # print("第%d行，第%d列，对应的数据：%d"%(i,j,matrix[i][j]))
                pixel = matrix[i][j]
                matrix[i][j] = matrix[n-1-j][i]
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j]
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i]
                matrix[j][n-1-i] = pixel
        return matrix           

        
def main():
    matrix = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
    ]
    s = Solution()
    matrix1 = s.rotate(matrix)
    n = len(matrix1)
    for i in range(0, n):
        for j in range(0, n):
            print("第%d行，第%d列，对应的数据：%d"%(i,j,matrix1[i][j]))

if __name__ == '__main__':
    main()