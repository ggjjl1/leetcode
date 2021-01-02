#!/usr/bin/env python
# -*- coding: utf-8 -*-

"com.ggjjl1.leetcode 26. Remove Duplicates from Sorted Array"

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 0
        while i < len(nums):
            if i - 1 >= 0 and nums[i] == nums[i-1]:
                nums.pop(i)
            else:
                i = i + 1
        return len(nums)

def main():
    s = Solution()
    print(s.removeDuplicates([0,0,1,1,1,2,2,3,3,4]))

if __name__ == '__main__':
    main()