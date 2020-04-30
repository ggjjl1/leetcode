#!/usr/bin/env python
# -*- coding: utf-8 -*-

import time

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums_size = len(nums)
        if nums_size < 3:
            return []
        # 冒泡排序，任意排序都可以
        for i in range(nums_size):
            for j in range(i+1,nums_size):
                if nums[i] > nums[j]:
                    tmp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = tmp
        # nums.sort()
        list_result = []
        for i in range(0, nums_size - 2):
            if nums[i] > 0: break
            if i <> 0 and nums[i] == nums[i-1]: continue
            target = 0 - nums[i]
            j, k = i + 1, nums_size - 1
            while j < k:
                if nums[j] + nums[k] == target:
                    if len(list_result) == 0 or list_result[-1] <> [nums[i], nums[j], nums[k]]:
                        list_result.append([nums[i], nums[j], nums[k]])
                if nums[j] + nums[k] > target: 
                    k = k - 1
                else: 
                    j = j + 1
        return list_result

def main():
    # nums = [-1,0,1,2,-1,-4]
    nums = [1,-1,-1,0]
    f = open("/Users/ggjjl1/Desktop/testcase.txt")
    text = f.read()
    f.close()
    input_list = text.strip("[]").split(",")
    nums2 = [int(x) for x in input_list]
    print("数组长度: %d" % len(nums2))
    print(nums2[0:10])
    s = Solution()
    time1 = int(time.time())
    t = s.threeSum(nums)
    time2 = int(time.time())
    for i in t:
        print(i)
    print("排序后的结果：%s" % t[0:10])
    print("耗费时间：%d秒" % (time2 - time1))

if __name__ == '__main__':
    main()
