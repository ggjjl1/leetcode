#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        tmp = nums[0]
        maxvalue = tmp
        for i in range(1, len(nums)):
            if tmp + nums[i] < nums[i]:
                tmp = nums[i]
                maxvalue = max(maxvalue, tmp, nums[i])
            else:
                tmp = tmp + nums[i]
                maxvalue = max(maxvalue, tmp, nums[i])
        return maxvalue

def main():
    s = Solution()
    print(s.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))

if __name__ == '__main__':
    main()