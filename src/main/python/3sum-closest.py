#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        result = [0, 1, 2]
        sum = nums[result[0]] + nums[result[1]] + nums[result[2]]
        for i in range(0, len(nums)-2):
            target1 = target - nums[i]
            for j in range(i+1, len(nums)-1):
                target2 = target1 - nums[j]
                for k in range(j+1, len(nums)):
                    if abs(target2 - nums[k]) < abs(target - sum):
                        result[0], result[1], result[2] = i, j, k
                        sum = nums[i] + nums[j] + nums[k]
        return sum

def main():
    s = Solution()
    print(s.threeSumClosest([1,1,1,0], -100))

if __name__ == '__main__':
    main()