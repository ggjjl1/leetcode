#!/usr/local/env python
# -*- coding: utf-8 -*-
# from __future__ import division

class Median_of_Two_Sorted_Arrays(object):
    '''
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
    '''

    def findMedianSortedArrays(self, nums1, nums2):
        len1 = len(nums1)
        len2 = len(nums2)
        lenx = len1 + len2
        half1 = len1 / 2
        half2 = len2 / 2
        i, j, k = 0, 0, 0
        tmp, med, medx = 0, 0, 0
        if len1 == 0:
            return (nums2[half2] + nums2[~half2]) / 2.0
        if len2 == 0:
            return (nums1[half1] + nums1[~half1]) / 2.0
        while i < lenx / 2 + 1:
            if j < len1 and k < len2:
                if nums1[j] < nums2[k]:
                    tmp = nums1[j]
                    j += 1
                else:
                    tmp = nums2[k]
                    k += 1
            else:
                if j < len1:
                    tmp = nums1[j]
                    j += 1
                if k < len2:
                    tmp = nums2[k]
                    k += 1
            i += 1
            if i == lenx / 2:
                med = tmp
            if i == lenx / 2 + 1:
                medx = tmp
        return lenx % 2 == 0 and (med + medx) / 2.0 or medx
                 
def main():
    median = Median_of_Two_Sorted_Arrays()
    # nums1 = [1, 3]
    # nums2 = [2]
    nums1 = [2]
    nums2 = []
    m = median.findMedianSortedArrays(nums1, nums2)
    print(m)

if __name__ == '__main__':
    main()
