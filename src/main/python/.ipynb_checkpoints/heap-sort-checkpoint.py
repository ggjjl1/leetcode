#!/usr/bin/env python
# -*- coding: utf-8 -*-

def heap_sort(nums):
    # 堆调整
    def max_heapify(nums, i, length):
        parent = i
        child = 2 * i + 1
        if child >= length:
            return
        if child + 1 < length and nums[child] < nums[child+1]:
            child += 1
        if nums[parent] < nums[child]:
            nums[parent], nums[child] = nums[child], nums[parent]
            max_heapify(nums, child, length)
    
    # 初始化，构造大顶堆
    for i in range(len(nums) // 2 - 1, -1, -1):
        max_heapify(nums, i, len(nums))

    # 堆排序
    for j in range(len(nums) - 1, 0, -1):
        nums[0], nums[j] = nums[j], nums[0]
        max_heapify(nums, 0, j)

def main():
    nums = [2, 3, 5, 4, 1, 7, 9, 6]
    heap_sort(nums)
    print(nums)

if __name__ == '__main__':
    main()