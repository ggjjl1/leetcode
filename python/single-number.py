#!/usr/bin/env python
#-*- coding: utf-8 -*-

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result = 0
        for i in range(0, len(nums)):
            result = result ^ nums[i]
        return result

def main():
    nums = [2,2,1]
    nums2 = [4,1,2,1,2]
    s = Solution()
    result = s.singleNumber(nums2)
    print(result)

if __name__ == '__main__':
    main()