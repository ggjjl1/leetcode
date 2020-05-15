#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(0, len(nums)-1):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] == target: return [i, j]

def main():
    nums = [2, 7, 11, 15]
    target = 9
    s = Solution()
    r = s.twoSum(nums, target)
    print(r)

if __name__ == '__main__':
    main()
