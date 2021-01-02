#!/usr/bin/env python
# -*- coding: utf-8 -*-

"本题参考网上给的解题思路"

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        map = {0: -1}
        max_length = 0
        sum = 0
        for i in range(0, len(nums)):
            sum += 1 if nums[i] == 1 else -1
            if map.has_key(sum):
                max_length = max(max_length, i - map[sum])
            else:
                map[sum] = i
        return max_length

def main():
    s = Solution()
    print(s.findMaxLength([0,1,0]))

if __name__ == '__main__':
    main()