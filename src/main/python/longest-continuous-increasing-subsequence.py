#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def findLengthOfLCIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        l, r = 0, 0
        for i in range(0, len(nums)):
            if nums[r] >= nums[i]:
                res = max(res, r - l + 1)
                l = r = i
            else:
                r = i
        res = 0 if len(nums) == 0 else max(res, r - l + 1)
        
        return res


if __name__ == '__main__':
    s = Solution()
    print(s.findLengthOfLCIS([1,3,5,7]))