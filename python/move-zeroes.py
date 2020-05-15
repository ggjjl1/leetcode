#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        for i in range(0, len(nums)):
            if nums[i] == 0:
                for j in range(i+1, len(nums)):
                    if nums[j] <> 0:
                        nums[i] = nums[j]
                        nums[j] = 0
                        break
        return nums
        
def main():
    s = Solution()
    l = s.moveZeroes([0,1,0,3,12])
    print([x for x in l])

if __name__ == '__main__':
    main()