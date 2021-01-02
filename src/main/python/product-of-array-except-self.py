#!/usr/bin/env python
# -*- coding: utf-8 -*-

"本题参考网上给的解题思路，通过提前计算两个乘积数组"

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        output = []
        left, right = [], []
        element_left, element_right = 1, 1
        for i in range(0, len(nums)):
            element_left = element_left * nums[i]
            element_right = element_right * nums[len(nums)-1-i]
            left.append(element_left)
            right.append(element_right)
        for j in range(0, len(nums)):
            product_left = 1 if j - 1 < 0 else left[j-1]
            product_right = 1 if len(nums) - j - 2 < 0 else right[len(nums)-j-2]
            output.append(product_left*product_right)
        return output

def main():
    s = Solution()
    print(s.productExceptSelf([1, 2, 3, 4]))

if __name__ == '__main__':
    main()