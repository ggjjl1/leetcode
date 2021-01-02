#!/usr/bin/env python
# -*- coding: utf-8 -*-

def mergeSort(nums):
    if len(nums) == 1: 
        return nums

    mid = len(nums) // 2
    left = mergeSort(nums[:mid])
    right = mergeSort(nums[mid:])
    result = []
    while left and right:
        if left[0] <= right[0]:
            result.append(left.pop(0))
        else:
            result.append(right.pop(0))
    if left:
        result += left
    if right:
        result += right
    return result

def main():
    nums = [1, 3, 5, 2, 6, 7, 2, 3]
    print(mergeSort(nums))

if __name__ == '__main__':
    main()