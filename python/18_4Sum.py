#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        rlist = []
        nums.sort()
        for i in range(0, len(nums)-3):
            for j in range(i+1, len(nums)-2):
                for k in range(j+1, len(nums)-1):
                    left = target - nums[i] - nums[j] - nums[k]
                    if left in nums[k+1:]:
                        if [nums[i], nums[j], nums[k], left] not in rlist:
                            rlist.append([nums[i], nums[j], nums[k], left])
        return rlist

def main():
    s = Solution()
    result = s.fourSum([1, 0, -1, 0, -2, 2], 0)
    for i in result:
        print(i)

if __name__ == '__main__':
    main()