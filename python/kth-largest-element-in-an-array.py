#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def findKthLargest(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        self.quick_sort(nums, 0, len(nums) - 1)
        return nums[-k]

    def quick_sort(self, nums, left, right):
        if left >= right: return
        
        pivot = nums[left]
        i, j = left, right
        while i < j:
            while i < j and nums[j] >= pivot:
                j = j - 1
            nums[i] = nums[j]

            while i < j and nums[i] <= pivot:
                i = i + 1
            nums[j] = nums[i]
        nums[i] = pivot

        self.quick_sort(nums, left, i - 1)
        self.quick_sort(nums, i + 1, right)

def main():
    nums = [3,2,1,5,6,4]
    k = 2
    s = Solution()
    print(s.findKthLargest(nums, k))

if __name__ == '__main__':
    main()