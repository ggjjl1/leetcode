#!/usr/bin/env python
# -*- coding: utf-8 -*-


class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        """
        i = 0
        while i < len(nums):
            if nums[i] == val:
                nums[i] = nums[0]
                nums.pop(0)
            else:
                i = i + 1
        return len(nums)
        """
        while(val in nums):
            nums.remove(val)
        return len(nums)

def main():
    s = Solution()
    print(s.removeElement([0,1,2,2,3,0,4,2],2))

if __name__ == '__main__':
    main()