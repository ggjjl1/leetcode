#!/usr/local/env python
# -*- coding: utf-8 -*-
# from __future__ import division

class Median_of_Two_Sorted_Arrays(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums = nums1 + nums2
        nums.sort()
        half = len(nums) / 2
        return (nums[half] + nums[~half]) / 2.0

def main():
    median = Median_of_Two_Sorted_Arrays()
    nums1 = [1, 3]
    nums2 = [2]
    m = median.findMedianSortedArrays(nums1, nums2)
    print(m)

if __name__ == '__main__':
    main()
